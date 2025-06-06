package Model.Enterprise;

import Model.Organization.AdministrationUnit;
import Model.Organization.ClinicalServicesUnit;
import Model.Organization.DeliveryUnit;
import Model.Organization.DonationManagementUnit;
import Model.Organization.EmergencyDispatchUnit;
import Model.Organization.EmergencyResponseUnit;
import Model.Organization.EquipmentTechnicianUnit;
import Model.Organization.OperationsSupportUnit;
import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.Organization.OrganizationDirectory;
import Model.Organization.Organization;
import Model.Organization.ResourceAnalyzeUnit;
import Model.Organization.SupplyChainManagementUnit;

public class Enterprise {
    private String id;
    private String name;
    private EnterpriseType type;
    private String description;
    private String manager;
    private ContactInfo contactInfo;
    private String networkBelong;
    private OrganizationDirectory organizations;
    private Person admin;
    
    public enum EnterpriseType {
        HOSPITAL,
        EMERGENCY,
        LOGISTICS,
        PUBLIC_HEALTH
    }

    public Enterprise() {
        this.organizations = new OrganizationDirectory();
    }

public enum OrganizationType {
    CLINICAL,
    ADMINISTRATION,
    DONATION,
    LOGISTICS,
    DELIVERY,
    SUPPORT,
    EMERGENCYR,     // Emergency Response
    EMERGENCYD,     // Emergency Dispatch
    TECHNICIAN      // Equipment Technician
}

    
    public Organization createOrganization(String name, OrganizationType type, ContactInfo contactInfo) {
    Organization org;

    switch (type) {
        case CLINICAL:
            org = new ClinicalServicesUnit(name, contactInfo, true);  // ICU
            break;
        case ADMINISTRATION:
            org = new AdministrationUnit(name, contactInfo);
            break;
        case DONATION:
            org = new DonationManagementUnit(name, contactInfo);
            break;
        case EMERGENCYR:
            org = new EmergencyResponseUnit(name, contactInfo);
            break;
        case EMERGENCYD:
            org = new EmergencyDispatchUnit(name, contactInfo);
            break;
        case TECHNICIAN:
            org = new EquipmentTechnicianUnit(name, contactInfo);
            break;
        case LOGISTICS:
            org = new SupplyChainManagementUnit(name, contactInfo);
            break;
        case DELIVERY:
            org = new DeliveryUnit(name, contactInfo);
            break;
        case SUPPORT:
            org = new OperationsSupportUnit(name, contactInfo);
            break;
        default:
            throw new IllegalArgumentException("Unsupported OrganizationType: " + type);
    }

    organizations.addOrganization(org);
    return org;
}


    // 删除组织
    public boolean deleteOrganization(String organizationId) {
        return organizations.removeOrganization(organizationId);
    }

    // 修改组织
    public boolean updateOrganization(String organizationId, String organizationName) {
        Organization organization = organizations.findOrganizationById(organizationId);
        if (organization != null) {
            organization.setOrganizationName(organizationName);
            return true;
        }
        return false;
    }

    // 查询组织
    public Organization findOrganizationById(String organizationId) {
        return organizations.findOrganizationById(organizationId);
    }

    private String generateOrganizationId() {
        return "ORG_" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public EnterpriseType getType() { return type; }
    public void setType(EnterpriseType type) { this.type = type; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }
    
    public ContactInfo getContactInfo() { return contactInfo; }
    public void setContactInfo(ContactInfo contactInfo) { this.contactInfo = contactInfo; }
    
    public String getNetworkBelong() { return networkBelong; }
    public void setNetworkBelong(String networkBelong) { this.networkBelong = networkBelong; }
    
    public OrganizationDirectory getOrganizations() { return organizations; }
    public void setOrganizations(OrganizationDirectory organizations) { this.organizations = organizations; }
    
    public Person getAdmin() { return admin; }
    public void setAdmin(Person admin) { this.admin = admin; }
}