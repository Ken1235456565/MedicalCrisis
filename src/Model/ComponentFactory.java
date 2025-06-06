package Model;

import com.github.javafaker.Faker;
import java.util.Random;
import Model.Network.Network;
import Model.Network.NetworkDirectory;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Enterprise.EnterpriseType;
import Model.Enterprise.Enterprise.OrganizationType;
import Model.Organization.*;
import Model.Patient.Patient;
import Model.Patient.PatientDirectory;
import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.User.UserAccount;
import Model.Role.*;
import Model.RoleProfile.*;
import Model.Supplies.*;
import Model.User.UserAccountDirectory;
import Model.WorkQueue.*;
import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class ComponentFactory {
    private Faker faker;
    private ConfigurationContext context;
    private Random random;
    private EcoSystem ecoSystem;

    public ComponentFactory() {
        this.faker = new Faker();
        this.random = new Random();
        this.context = new ConfigurationContext(); // Initialize ConfigurationContext
        this.ecoSystem = EcoSystem.getInstance(); // Get the singleton EcoSystem
        initializeData();
    }
    

    public void initializeData() {
        // 1. Initialize EcoSystem's directories if not already done
        if (ecoSystem.getNetworkDirectory() == null) {
            ecoSystem.setNetworkDirectory(new NetworkDirectory());
        }
        if (ecoSystem.getUserAccountDirectory() == null) {
            ecoSystem.setUserAccountDirectory(new UserAccountDirectory());
        }

        // 2. Create and set system admin for EcoSystem
        ContactInfo sysAdminContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person sysAdminPerson = new Person();
        sysAdminPerson.setId("PERSON_" + UUID.randomUUID().toString());
        sysAdminPerson.setName(faker.name().fullName());
        sysAdminPerson.setGender(random.nextBoolean() ? "Male" : "Female");
        sysAdminPerson.setAge(random.nextInt(40) + 25); // Age between 25-64
        sysAdminPerson.setContactInfo(sysAdminContact);
        sysAdminPerson.addRoleProfile("Admin", new AdminProfile()); // Assign AdminProfile
        this.context.setSysAdmin(sysAdminPerson); // Set in ConfigurationContext
        ecoSystem.setAdmin(sysAdminPerson); // Set in EcoSystem

        Role adminRole = new AdminRole();
        adminRole.setId("ROLE_ADMIN");
        adminRole.setName("System Admin");
        adminRole.setAdmin(true);
        adminRole.setDescription("System Administrator Role");
        // Add admin role to a centralized role directory if available, or directly use it for user account.
        // Assuming EcoSystem's UserAccountDirectory can handle this.
        UserAccount sysAdminAccount = new UserAccount(
            "USER_SYSADMIN", "sysadmin", "sysadmin", adminRole, null, sysAdminPerson);
        ecoSystem.getUserAccountDirectory().addUserAccount(sysAdminAccount);


        // 3. Create Networks
        Network mainNetwork = createNetwork("Global Health Network", "Healthcare", "Main network for all health services");
        ecoSystem.getNetworkDirectory().getAllNetworks().add(mainNetwork); // Add to EcoSystem's NetworkDirectory

        // 4. Create Enterprises within the Network
        Enterprise hospitalEnterprise = mainNetwork.createEnterprise(EnterpriseType.HOSPITAL, "Central Hospital", "Main hospital for the city", faker.name().fullName(), new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        this.context.setHospitalEnterprise(hospitalEnterprise);

        Enterprise emergencyEnterprise = mainNetwork.createEnterprise(EnterpriseType.EMERGENCY, "City Emergency Services", "Provides rapid emergency response", faker.name().fullName(), new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        this.context.setEmergencyEnterprise(emergencyEnterprise);

        Enterprise logisticsEnterprise = mainNetwork.createEnterprise(EnterpriseType.LOGISTICS, "Healthcare Logistics Co.", "Manages supply chain and deliveries", faker.name().fullName(), new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        this.context.setLogisticsEnterprise(logisticsEnterprise);

        Enterprise publicHealthEnterprise = mainNetwork.createEnterprise(EnterpriseType.PUBLIC_HEALTH, "Public Health Institute", "Monitors and manages public health data", faker.name().fullName(), new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        this.context.setPublicHealthEnterprise(publicHealthEnterprise);

        // 5. Create Organizations within Enterprises
        ContactInfo defaultContact = new ContactInfo("Unknown location", "000-000-0000", "unknown@org.com");
        // Hospital Organizations
        ClinicalServicesUnit clinicalServicesOrg = (ClinicalServicesUnit) hospitalEnterprise.createOrganization("Hospital Administration", OrganizationType.CLINICAL, defaultContact);
        this.context.setClinicalServicesOrg(clinicalServicesOrg);
        clinicalServicesOrg.setPatientDirectory(new PatientDirectory()); // Initialize patient directory
        clinicalServicesOrg.setICUbedCatalog(new ICUbedCatalog()); // Initialize ICU bed catalog
        clinicalServicesOrg.setSupplyItemCatalog(new SupplyItemCatalog()); // Initialize supply item catalog
        clinicalServicesOrg.setAppointmentSchedule(new AppointmentSchedule()); // Initialize appointment schedule
        clinicalServicesOrg.setEcoSystem(ecoSystem); // Set EcoSystem reference

        AdministrationUnit hospitalAdminOrg = (AdministrationUnit) hospitalEnterprise.createOrganization("Hospital Administration", OrganizationType.ADMINISTRATION, defaultContact);
        this.context.setHospitalAdminOrg(hospitalAdminOrg);

        EquipmentTechnicianUnit equipmentTechnicianUnit = (EquipmentTechnicianUnit) hospitalEnterprise.createOrganization("Equipment Technician Unit", OrganizationType.TECHNICIAN, defaultContact);
        equipmentTechnicianUnit.setEquipmentsCatalog(new EquipmentsCatalog()); // Initialize equipment catalog

        // Emergency Response Unit
        EmergencyResponseUnit emergencyResponseOrg = (EmergencyResponseUnit)
                emergencyEnterprise.createOrganization("Emergency Response Unit", OrganizationType.EMERGENCYR, defaultContact);
        this.context.setEmergencyResponseOrg(emergencyResponseOrg);
        
        emergencyResponseOrg.setDeliveryCatalog(new DeliveryCatalog());
        emergencyResponseOrg.setMissionCatalog(new MissionCatalog());

        // Emergency Dispatch Unit
        EmergencyDispatchUnit emergencyDispatchUnit = (EmergencyDispatchUnit)
                emergencyEnterprise.createOrganization("Emergency Dispatch Unit", OrganizationType.EMERGENCYD, defaultContact);
        this.context.setEmergencyDispatchUnit(emergencyDispatchUnit);


        // Logistics Organizations
        SupplyChainManagementUnit inventoryManagerOrg = (SupplyChainManagementUnit) logisticsEnterprise.createOrganization("Supply Chain Management Unit", OrganizationType.LOGISTICS, defaultContact);
        this.context.setInventoryManagerOrg(inventoryManagerOrg);
        inventoryManagerOrg.setSupplyItemCatalog(new SupplyItemCatalog()); // Initialize supply item catalog
        inventoryManagerOrg.setDeliveryCatalog(new DeliveryCatalog()); // Initialize delivery catalog
        inventoryManagerOrg.setVehicleCatalog(new VehicleCatalog()); // Initialize vehicle catalog
        inventoryManagerOrg.setWorkRequestDirectory(new WorkRequestDirectory()); // Initialize work request directory

        DeliveryUnit deliveryUnitOrg = (DeliveryUnit) logisticsEnterprise.createOrganization("Delivery Unit",OrganizationType.DELIVERY, defaultContact);
        this.context.setDeliveryUnit(deliveryUnitOrg);

        // Public Health Organizations
        DonationManagementUnit donationManagementOrg = (DonationManagementUnit) publicHealthEnterprise.createOrganization("Donation Management Unit",OrganizationType.DONATION, defaultContact);
        this.context.setDonationManagementOrg(donationManagementOrg);
        donationManagementOrg.setDonationRecords(new DonationCatalog()); // Initialize donation catalog

        OperationsSupportUnit operationsSupportOrg = (OperationsSupportUnit) publicHealthEnterprise.createOrganization("Operations Support Unit", OrganizationType.SUPPORT, defaultContact);
        this.context.setOperationsSupportOrg(operationsSupportOrg);


        // 6. Create key Persons and assign roles/profiles for ConfigurationContext
        // Doctor
        ContactInfo doctorContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person doctorPerson = clinicalServicesOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(30) + 30, doctorContact); // Age 30-59
        DoctorProfile doctorProfile = new DoctorProfile();
        doctorProfile.setSpecialization(faker.job().title());
        doctorProfile.setLicenseNumber(faker.idNumber().validSvSeSsn());
        doctorPerson.addRoleProfile("Doctor", doctorProfile);
        this.context.setDoctor(doctorPerson);
        // Create user account for doctor
        Role doctorRole = new DoctorRole();
        doctorRole.setId("ROLE_DOCTOR");
        doctorRole.setName("Doctor");
        doctorRole.setAdmin(false);
        doctorRole.setDescription("Medical Doctor Role");
        clinicalServicesOrg.createUserAccount("doctor", "password", doctorRole, doctorPerson);

        // Nurse
        ContactInfo nurseContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person nursePerson = clinicalServicesOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(20) + 25, nurseContact); // Age 25-44
        NurseProfile nurseProfile = new NurseProfile();
        nurseProfile.setNurseType(random.nextBoolean() ? "RN" : "LPN");
        nurseProfile.setLicenseNumber(faker.idNumber().validSvSeSsn());
        nursePerson.addRoleProfile("Nurse", nurseProfile);
        this.context.setNurse(nursePerson);
        // Create user account for nurse
        Role nurseRole = new NurseRole();
        nurseRole.setId("ROLE_NURSE");
        nurseRole.setName("Nurse");
        nurseRole.setAdmin(false);
        nurseRole.setDescription("Registered Nurse Role");
        clinicalServicesOrg.createUserAccount("nurse", "password", nurseRole, nursePerson);

        // Payroll Staff
        ContactInfo payrollStaffContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person payrollStaffPerson = hospitalAdminOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(30) + 25, payrollStaffContact);
        PayrollStaffProfile payrollStaffProfile = new PayrollStaffProfile();
        payrollStaffProfile.setPayrollStaffID(faker.idNumber().validSvSeSsn());
        payrollStaffPerson.addRoleProfile("PayrollStaff", payrollStaffProfile);
        this.context.setPayrollStaff(payrollStaffPerson);
        // Create user account for payroll staff
        Role payrollStaffRole = new PayrollStaffRole();
        payrollStaffRole.setId("ROLE_PAYROLL");
        payrollStaffRole.setName("Payroll Staff");
        payrollStaffRole.setAdmin(false);
        payrollStaffRole.setDescription("Manages payroll operations");
        hospitalAdminOrg.createUserAccount("payrollStaff", "password", payrollStaffRole, payrollStaffPerson);

        // Resource Analyst
        ContactInfo resourceAnalystContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person resourceAnalystPerson = operationsSupportOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(30) + 28, resourceAnalystContact);
        ResourceAnalystProfile resourceAnalystProfile = new ResourceAnalystProfile();
        resourceAnalystProfile.setAnalysisArea(faker.company().industry());
        resourceAnalystPerson.addRoleProfile("ResourceAnalyst", resourceAnalystProfile);
        this.context.setResourceAnalyst(resourceAnalystPerson);
        // Create user account for resource analyst
        Role resourceAnalystRole = new ResourceAnalystRole();
        resourceAnalystRole.setId("ROLE_RESOURCE_ANALYST");
        resourceAnalystRole.setName("Resource Analyst");
        resourceAnalystRole.setAdmin(false);
        resourceAnalystRole.setDescription("Analyzes resource allocation and usage");
        operationsSupportOrg.createUserAccount("resourceAnalyst", "password", resourceAnalystRole, resourceAnalystPerson);

        // Emergency Dispatcher
        ContactInfo dispatcherContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person dispatcherPerson = emergencyDispatchUnit.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(20) + 25, dispatcherContact);
        EmergencyDispatcherProfile dispatcherProfile = new EmergencyDispatcherProfile();
        dispatcherProfile.setDispatchZone(faker.address().cityName());
        dispatcherProfile.setCertificationLevel(faker.options().option("Level 1", "Level 2", "Level 3"));
        dispatcherPerson.addRoleProfile("EmergencyDispatcher", dispatcherProfile);
        this.context.setDispatcher(dispatcherPerson);
        // Create user account for dispatcher
        Role dispatcherRole = new EmergencyDispatcherRole();
        dispatcherRole.setId("ROLE_DISPATCHER");
        dispatcherRole.setName("Emergency Dispatcher");
        dispatcherRole.setAdmin(false);
        dispatcherRole.setDescription("Dispatches emergency services");
        emergencyDispatchUnit.createUserAccount("emergencyDispatcher", "password", dispatcherRole, dispatcherPerson);

        // Emergency Responder
        ContactInfo responderContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person responderPerson = emergencyResponseOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(25) + 22, responderContact);
        EmergencyResponderProfile responderProfile = new EmergencyResponderProfile();
        responderProfile.setResponderType(faker.options().option("EMT", "Paramedic", "Firefighter"));
        responderProfile.setCertificationLevel(faker.options().option("Basic", "Advanced"));
        responderPerson.addRoleProfile("EmergencyResponder", responderProfile);
        this.context.setResponder(responderPerson);
        // Create user account for responder
        Role responderRole = new EmergencyResponderRole();
        responderRole.setId("ROLE_RESPONDER");
        responderRole.setName("Emergency Responder");
        responderRole.setAdmin(false);
        responderRole.setDescription("Responds to emergency calls");
        emergencyResponseOrg.createUserAccount("emergencyResponder", "password", responderRole, responderPerson);

        // Logistics Manager
        ContactInfo logisticsManagerContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person logisticsManagerPerson = inventoryManagerOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(35) + 30, logisticsManagerContact);
        LogisticsManagerProfile logisticsManagerProfile = new LogisticsManagerProfile();
        logisticsManagerProfile.setLogisticsManagerID(faker.idNumber().validSvSeSsn());
        logisticsManagerPerson.addRoleProfile("LogisticsManager", logisticsManagerProfile);
        this.context.setLogisticsManager(logisticsManagerPerson);
        // Create user account for logistics manager
        Role logisticsManagerRole = new LogisticsManagerRole();
        logisticsManagerRole.setId("ROLE_LOGISTICS_MANAGER");
        logisticsManagerRole.setName("Logistics Manager");
        logisticsManagerRole.setAdmin(false);
        logisticsManagerRole.setDescription("Manages logistics operations");
        inventoryManagerOrg.createUserAccount("logisticsManager", "password", logisticsManagerRole, logisticsManagerPerson);

        // Delivery Staff
        ContactInfo deliveryStaffContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person deliveryStaffPerson = deliveryUnitOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(20) + 20, deliveryStaffContact);
        DeliveryStaffProfile deliveryStaffProfile = new DeliveryStaffProfile();
        deliveryStaffProfile.setVehicleType(faker.options().option("Van", "Truck", "Motorcycle"));
        deliveryStaffProfile.setLicenseNumber(faker.idNumber().validSvSeSsn());
        deliveryStaffPerson.addRoleProfile("DeliveryStaff", deliveryStaffProfile);
        this.context.setDeliveryStaff(deliveryStaffPerson);
        // Create user account for delivery staff
        Role deliveryStaffRole = new DeliveryStaffRole();
        deliveryStaffRole.setId("ROLE_DELIVERY_STAFF");
        deliveryStaffRole.setName("Delivery Staff");
        deliveryStaffRole.setAdmin(false);
        deliveryStaffRole.setDescription("Handles deliveries");
        deliveryUnitOrg.createUserAccount("deliveryStaff", "password", deliveryStaffRole, deliveryStaffPerson);

        // Donation Coordinator
        ContactInfo donationCoordinatorContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person donationCoordinatorPerson = donationManagementOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(25) + 25, donationCoordinatorContact);
        DonationCoordinatorProfile donationCoordinatorProfile = new DonationCoordinatorProfile();
        donationCoordinatorProfile.setRegion(faker.address().city());
        donationCoordinatorPerson.addRoleProfile("DonationCoordinator", donationCoordinatorProfile);
        this.context.setDonationCoordinator(donationCoordinatorPerson);
        // Create user account for donation coordinator
        Role donationCoordinatorRole = new DonationCoordinatorRole();
        donationCoordinatorRole.setId("ROLE_DONATION_COORDINATOR");
        donationCoordinatorRole.setName("Donation Coordinator");
        donationCoordinatorRole.setAdmin(false);
        donationCoordinatorRole.setDescription("Coordinates donation activities");
        donationManagementOrg.createUserAccount("donationCoordinator", "password", donationCoordinatorRole, donationCoordinatorPerson);

        // Supply Chain Manager
        ContactInfo supplychainManagerContact = new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress());
        Person supplychainManagerPerson = inventoryManagerOrg.createPerson(faker.name().fullName(), random.nextBoolean() ? "Male" : "Female", random.nextInt(35) + 30, supplychainManagerContact);
        SupplychainManagerProfile supplychainManagerProfile = new SupplychainManagerProfile();
        supplychainManagerProfile.setSupplychainManagerID(faker.idNumber().validSvSeSsn());
        supplychainManagerPerson.addRoleProfile("SupplychainManager", supplychainManagerProfile);
        this.context.setSupplychainManager(supplychainManagerPerson);
        // Create user account for supply chain manager
        Role supplychainManagerRole = new SupplychainManagerRole();
        supplychainManagerRole.setId("ROLE_SUPPLYCHAIN_MANAGER");
        supplychainManagerRole.setName("Supply Chain Manager");
        supplychainManagerRole.setAdmin(false);
        supplychainManagerRole.setDescription("Manages the supply chain");
        inventoryManagerOrg.createUserAccount("supplyChainManager", "password", supplychainManagerRole, supplychainManagerPerson);


        // Example of creating other entities and adding them to their respective organizations/catalogs
        // Create a patient and add to ClinicalServicesUnit
        Patient patient = new Patient();
        patient.patientId = "PATIENT_" + UUID.randomUUID().toString();
        patient.name = faker.name().fullName();
        patient.condition = faker.medical().diseaseName();
        clinicalServicesOrg.getPatientDirectory().getPatients().add(patient);

        // Create a supply item and add to SupplyChainManagementUnit's catalog
        SupplyItem medication = new SupplyItem();
        medication.setSupplyId("SUPPLY_" + UUID.randomUUID().toString());
        medication.setName("Pain Reliever");
        medication.setDescription("Over-the-counter pain medication");
        medication.setType("Medication");
        medication.setQuantity(random.nextInt(1000) + 100);
        medication.setUnitPrice(random.nextDouble() * 10 + 5);
        medication.setExpirationDate(faker.date().future(365, java.util.concurrent.TimeUnit.DAYS));
        medication.setManufacturer(faker.company().name());
        medication.setVendor(faker.company().name());
        inventoryManagerOrg.getSupplyItemCatalog().getItemList().add(medication);

        // Create an equipment and add to EquipmentTechnicianUnit's catalog
        Equipments ventilator = new Equipments();
        ventilator.setEquipmentId("EQUIP_" + UUID.randomUUID().toString());
        ventilator.setName("Ventilator");
        ventilator.setModel("V-1000");
        ventilator.setPurchaseDate(faker.date().past(5, java.util.concurrent.TimeUnit.DAYS));
        ventilator.setMaintenanceDate(faker.date().past(1, java.util.concurrent.TimeUnit.DAYS));
        ventilator.setWarrantyInformation("5 years");
        ventilator.setDepartment("ICU");
        ventilator.setStatus("Operational");
        equipmentTechnicianUnit.getEquipmentsCatalog().getEquipmentsList().add(ventilator);

        // Create an ICU bed and add to ClinicalServicesUnit's catalog
        ICUbed icuBed = new ICUbed();
        icuBed.setBedId("ICUBED_" + UUID.randomUUID().toString());
        icuBed.setOccupied(false);
        clinicalServicesOrg.getICUbedCatalog().getIcuBedList().add(icuBed);

        // Create a donation and add to DonationManagementUnit's catalog
        Donation monetaryDonation = new Donation();
        monetaryDonation.setDonationId("DON_" + UUID.randomUUID().toString());
        monetaryDonation.setDonorPerson(sysAdminPerson); // Example donor
        monetaryDonation.setDonationDate(new Date());
        monetaryDonation.setMonetaryAmount(random.nextDouble() * 10000 + 100);
        monetaryDonation.setPurpose("General Fund");
        monetaryDonation.setStatus("Completed");
        donationManagementOrg.getDonationRecords().getDonationList().add(monetaryDonation);

        // Create a vehicle and add to SupplyChainManagementUnit's catalog
        Vehicle truck = new Vehicle();
        truck.setVehicleId("VEH_" + UUID.randomUUID().toString());
        truck.setType("Truck");
        truck.setStatus("Available");
        truck.setFuelLevel(random.nextDouble() * 100);
        inventoryManagerOrg.getVehicleCatalog().getVehicleList().add(truck);
    }

    // Helper method to create a Network
    private Network createNetwork(String name, String type, String description) {
        Network network = new Network();
        network.setId("NET_" + UUID.randomUUID().toString());
        network.setName(name);
        network.setType(type);
        network.setDescription(description);
        network.setManager(faker.name().fullName());
        network.setContactInfo(new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        // Set a network admin
        Person networkAdmin = new Person();
        networkAdmin.setId("PERSON_" + UUID.randomUUID().toString());
        networkAdmin.setName(faker.name().fullName());
        networkAdmin.setGender(random.nextBoolean() ? "Male" : "Female");
        networkAdmin.setAge(random.nextInt(40) + 25);
        networkAdmin.setContactInfo(new ContactInfo(faker.address().fullAddress(), faker.phoneNumber().phoneNumber(), faker.internet().emailAddress()));
        networkAdmin.addRoleProfile("Admin", new AdminProfile());
        network.setAdmin(networkAdmin);

        return network;
    }

    // Getters for ConfigurationContext and EcoSystem
    public ConfigurationContext getContext() {
        return context;
    }

    public EcoSystem getEcoSystem() {
        return ecoSystem;
    }

}