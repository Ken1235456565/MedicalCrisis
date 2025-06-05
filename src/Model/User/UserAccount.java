package Model.User;

import Model.Role.Role;
import Model.Organization.Organization;
import Model.Person.Person;

public class UserAccount {
    private String userId;
    private String username;
    private String password;
    private Role role;
    private Organization organizationRef;
    private Person person;
}