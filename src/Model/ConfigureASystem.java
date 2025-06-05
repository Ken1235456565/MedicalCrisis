package Model;

import Model.Network.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.*;
import Model.Person.Person;

public class ConfigureASystem {
    private Network network;
    private Enterprise hospitalEnterprise;
    private Enterprise emergencyEnterprise;
    private Enterprise logisticsEnterprise;
    private Enterprise publicHealthEnterprise;
    private ClinicalServicesUnit clinicalServicesOrg;
    private AdministrationUnit hospitalAdminOrg;
    private EmergencyResponseUnit emergencyResponseOrg;
    private ResourceAnalyzeUnit emergencyDispatchOrg;
    private SupplyChainManagementUnit inventoryManagerOrg;
    private ResourceAnalyzeUnit deliveryUnitOrg;
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
}