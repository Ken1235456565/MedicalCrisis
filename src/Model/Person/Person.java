
package Model.Person;

import Model.RoleProfile.RoleProfile;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID; 

public class Person {
    private String id;
    private String gender;
    private int age;
    private String name;
    private Date dateOfBirth;
    private ContactInfo contactInfo;
    private Map<String, RoleProfile> roleProfiles;

    public Person() {
        this.roleProfiles = new HashMap<>();
    }

    // 添加角色档案
    public void addRoleProfile(String type, RoleProfile profile) {
        if (type != null && profile != null) {
            roleProfiles.put(type, profile);
        }
    }

    // 删除角色档案
    public boolean removeRoleProfile(String type) {
        return roleProfiles.remove(type) != null;
    }

    // 修改角色档案
    public boolean updateRoleProfile(String type, RoleProfile profile) {
        if (type != null && profile != null && roleProfiles.containsKey(type)) {
            roleProfiles.put(type, profile);
            return true;
        }
        return false;
    }

    // 查询角色档案
    public RoleProfile getRoleProfile(String type) {
        return roleProfiles.get(type);
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    
    public ContactInfo getContactInfo() { return contactInfo; }
    public void setContactInfo(ContactInfo contactInfo) { this.contactInfo = contactInfo; }
    
    public Map<String, RoleProfile> getRoleProfiles() { return roleProfiles; }
    public void setRoleProfiles(Map<String, RoleProfile> roleProfiles) { this.roleProfiles = roleProfiles; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id != null && id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}