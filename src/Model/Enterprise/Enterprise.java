package Model.Enterprise;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.Organization.OrganizationDirectory;

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
}