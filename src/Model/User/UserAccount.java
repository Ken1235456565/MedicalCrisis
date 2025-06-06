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

    public UserAccount() {}

    public UserAccount(String userId, String username, String password, Role role, Organization organizationRef, Person person) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.organizationRef = organizationRef;
        this.person = person;
    }

    // Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    
    public Organization getOrganizationRef() { return organizationRef; }
    public void setOrganizationRef(Organization organizationRef) { this.organizationRef = organizationRef; }
    
    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserAccount that = (UserAccount) obj;
        return userId != null && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }
}