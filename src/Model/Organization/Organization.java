package Model.Organization;

import Model.Person.PersonDirectory;
import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.WorkQueue.WorkQueue;
import Model.Role.RoleDirectory;
import Model.User.UserAccountDirectory;
import Model.Enterprise.Enterprise;

public class Organization {
    private String organizationId;
    private String organizationName;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private ContactInfo contactInfo;
    private RoleDirectory roleDirectory;
    private UserAccountDirectory userAccountDirectory;
    private Person admin;
    private Enterprise enterprise;
}