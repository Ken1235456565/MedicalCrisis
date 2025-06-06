package Model;

import Model.Network.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.*;
import Model.Person.Person;

public class ConfigurationContext {
    private static ConfigurationContext instance;

    private Network network;
    private Enterprise hospitalEnterprise;
    private Enterprise emergencyEnterprise;
    private Enterprise logisticsEnterprise;
    private Enterprise publicHealthEnterprise;
    private ClinicalServicesUnit clinicalServicesOrg;
    private AdministrationUnit hospitalAdminOrg;
    private EmergencyResponseUnit emergencyResponseOrg;
    private EmergencyDispatchUnit emergencyDispatchUnit;
    private DeliveryUnit deliveryUnit;
    private SupplyChainManagementUnit inventoryManagerOrg;
    private DonationManagementUnit donationManagementOrg;
    private OperationsSupportUnit operationsSupportOrg;
    private Person sysAdmin;
    private Person doctor;
    private Person nurse;
    private Person payrollStaff;
    private Person resourceAnalyst;
    private Person dispatcher;
    private Person responder;
    private Person logisticsManager;
    private Person deliveryStaff;
    private Person donationCoordinator;
    private Person supplychainManager;
    
    public ConfigurationContext() {
        // 构造时不做初始化，由 ComponentFactory 控制注入
    }
    
    public void setSysAdmin(Person person) {
        this.sysAdmin = person;
    }

    public Person getSysAdmin() {
        return this.sysAdmin;
    }

    public static ConfigurationContext getInstance() {
        return instance;
    }

    public static void setInstance(ConfigurationContext instance) {
        ConfigurationContext.instance = instance;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(Enterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public Enterprise getEmergencyEnterprise() {
        return emergencyEnterprise;
    }

    public void setEmergencyEnterprise(Enterprise emergencyEnterprise) {
        this.emergencyEnterprise = emergencyEnterprise;
    }

    public Enterprise getLogisticsEnterprise() {
        return logisticsEnterprise;
    }

    public void setLogisticsEnterprise(Enterprise logisticsEnterprise) {
        this.logisticsEnterprise = logisticsEnterprise;
    }

    public Enterprise getPublicHealthEnterprise() {
        return publicHealthEnterprise;
    }

    public void setPublicHealthEnterprise(Enterprise publicHealthEnterprise) {
        this.publicHealthEnterprise = publicHealthEnterprise;
    }

    public ClinicalServicesUnit getClinicalServicesOrg() {
        return clinicalServicesOrg;
    }

    public void setClinicalServicesOrg(ClinicalServicesUnit clinicalServicesOrg) {
        this.clinicalServicesOrg = clinicalServicesOrg;
    }

    public AdministrationUnit getHospitalAdminOrg() {
        return hospitalAdminOrg;
    }

    public void setHospitalAdminOrg(AdministrationUnit hospitalAdminOrg) {
        this.hospitalAdminOrg = hospitalAdminOrg;
    }

    public EmergencyResponseUnit getEmergencyResponseOrg() {
        return emergencyResponseOrg;
    }

    public void setEmergencyResponseOrg(EmergencyResponseUnit emergencyResponseOrg) {
        this.emergencyResponseOrg = emergencyResponseOrg;
    }

    public EmergencyDispatchUnit getEmergencyDispatchUnit() {
        return emergencyDispatchUnit;
    }

    public void setEmergencyDispatchUnit(EmergencyDispatchUnit emergencyDispatchUnit) {
        this.emergencyDispatchUnit = emergencyDispatchUnit;
    }

    public DeliveryUnit getDeliveryUnit() {
        return deliveryUnit;
    }

    public void setDeliveryUnit(DeliveryUnit deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
    }

    public SupplyChainManagementUnit getInventoryManagerOrg() {
        return inventoryManagerOrg;
    }

    public void setInventoryManagerOrg(SupplyChainManagementUnit inventoryManagerOrg) {
        this.inventoryManagerOrg = inventoryManagerOrg;
    }


    public DonationManagementUnit getDonationManagementOrg() {
        return donationManagementOrg;
    }

    public void setDonationManagementOrg(DonationManagementUnit donationManagementOrg) {
        this.donationManagementOrg = donationManagementOrg;
    }

    public OperationsSupportUnit getOperationsSupportOrg() {
        return operationsSupportOrg;
    }

    public void setOperationsSupportOrg(OperationsSupportUnit operationsSupportOrg) {
        this.operationsSupportOrg = operationsSupportOrg;
    }

    public Person getDoctor() {
        return doctor;
    }

    public void setDoctor(Person doctor) {
        this.doctor = doctor;
    }

    public Person getNurse() {
        return nurse;
    }

    public void setNurse(Person nurse) {
        this.nurse = nurse;
    }

    public Person getPayrollStaff() {
        return payrollStaff;
    }

    public void setPayrollStaff(Person payrollStaff) {
        this.payrollStaff = payrollStaff;
    }

    public Person getResourceAnalyst() {
        return resourceAnalyst;
    }

    public void setResourceAnalyst(Person resourceAnalyst) {
        this.resourceAnalyst = resourceAnalyst;
    }

    public Person getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Person dispatcher) {
        this.dispatcher = dispatcher;
    }

    public Person getResponder() {
        return responder;
    }

    public void setResponder(Person responder) {
        this.responder = responder;
    }

    public Person getLogisticsManager() {
        return logisticsManager;
    }

    public void setLogisticsManager(Person logisticsManager) {
        this.logisticsManager = logisticsManager;
    }

    public Person getDeliveryStaff() {
        return deliveryStaff;
    }

    public void setDeliveryStaff(Person deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }

    public Person getDonationCoordinator() {
        return donationCoordinator;
    }

    public void setDonationCoordinator(Person donationCoordinator) {
        this.donationCoordinator = donationCoordinator;
    }

    public Person getSupplychainManager() {
        return supplychainManager;
    }

    public void setSupplychainManager(Person supplychainManager) {
        this.supplychainManager = supplychainManager;
    }

    

}