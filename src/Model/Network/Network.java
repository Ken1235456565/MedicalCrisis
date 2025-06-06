package Model.Network;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.Enterprise.EnterpriseDirectory;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.Enterprise.EnterpriseDirectory;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Enterprise.EnterpriseType;

public class Network {
    private String id;
    private String name;
    private String type;
    private String description;
    private String manager;
    private ContactInfo contactInfo;
    private EnterpriseDirectory enterpriseDirectory;
    private Person admin;

    public Network() {
        this.enterpriseDirectory = new EnterpriseDirectory();
    }

    // 创建企业
    public Enterprise createEnterprise(EnterpriseType enterpriseType, String name, String description, String manager, ContactInfo contactInfo) {
        Enterprise enterprise = new Enterprise();
        enterprise.setId(generateEnterpriseId());
        enterprise.setName(name);
        enterprise.setType(enterpriseType);
        enterprise.setDescription(description);
        enterprise.setManager(manager);
        enterprise.setContactInfo(contactInfo);
        enterprise.setNetworkBelong(this.id);
        
        enterpriseDirectory.addEnterprise(enterprise);
        return enterprise;
    }

    // 删除企业
    public boolean deleteEnterprise(String enterpriseId) {
        return enterpriseDirectory.removeEnterprise(enterpriseId);
    }

    // 修改企业
    public boolean updateEnterprise(String enterpriseId, String name, String description, String manager, ContactInfo contactInfo) {
        Enterprise enterprise = enterpriseDirectory.findEnterpriseById(enterpriseId);
        if (enterprise != null) {
            enterprise.setName(name);
            enterprise.setDescription(description);
            enterprise.setManager(manager);
            enterprise.setContactInfo(contactInfo);
            return true;
        }
        return false;
    }

    // 查询企业
    public Enterprise findEnterpriseById(String enterpriseId) {
        return enterpriseDirectory.findEnterpriseById(enterpriseId);
    }

    private String generateEnterpriseId() {
        return "ENT_" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }
    
    public ContactInfo getContactInfo() { return contactInfo; }
    public void setContactInfo(ContactInfo contactInfo) { this.contactInfo = contactInfo; }
    
    public EnterpriseDirectory getEnterpriseDirectory() { return enterpriseDirectory; }
    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) { this.enterpriseDirectory = enterpriseDirectory; }
    
    public Person getAdmin() { return admin; }
    public void setAdmin(Person admin) { this.admin = admin; }
    
    
}