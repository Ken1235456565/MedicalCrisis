package Model.Organization;

import Model.Person.ContactInfo;
import Model.User.UserAccount;
import Model.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministrationUnit extends Organization {
    private List<UserAccount> userAccounts;
    private List<Role> definedRoles;
    private List<Organization> managedOrganizations;
    private Map<String, String> auditLogs;
    private boolean systemActive;
    
    public AdministrationUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo);
        this.userAccounts = new ArrayList<>();
        this.definedRoles = new ArrayList<>();
        this.managedOrganizations = new ArrayList<>();
        this.auditLogs = new HashMap<>();
        this.systemActive = true;
    }


    

}