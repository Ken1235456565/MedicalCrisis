package Model.Organization;

import Model.User.UserAccount;
import Model.Role.Role;
import java.util.List;
import java.util.Map;

public class AdministrationUnit extends Organization {
    private List<UserAccount> userAccounts;
    private List<Role> definedRoles;
    private List<Organization> managedOrganizations;
    private Map<String, String> auditLogs;
    private boolean systemActive;
}