package Model.Organization;

import Model.Person.ContactInfo;



public class ResourceAnalyzeUnit extends Organization {
    private String unitName;

    public ResourceAnalyzeUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo);
        this.unitName = name;
    }


}