package Model.Organization;

import Model.Person.PersonDirectory;
import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.WorkQueue.WorkQueue;
import Model.Role.RoleDirectory;
import Model.Role.Role;
import Model.User.UserAccountDirectory;
import Model.User.UserAccount;
import Model.Enterprise.Enterprise;
import java.util.UUID;

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
    private String description;

    // 共用的初始化逻辑，避免重复代码
    private void initializeDefaults() {
        this.organizationId = UUID.randomUUID().toString();
        this.personDirectory = new PersonDirectory();
        this.workQueue = new WorkQueue();
        this.roleDirectory = new RoleDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
    }

    // 默认构造函数（用于某些特殊情况，通常应少用）
    public Organization() {
        initializeDefaults();
    }

    // 构造函数：组织名 + 联系方式
    public Organization(String name, ContactInfo contactInfo) {
        initializeDefaults();
        this.organizationName = name;
        this.contactInfo = contactInfo;
    }

    // 构造函数：仅组织名
    public Organization(String organizationName) {
        initializeDefaults();
        this.organizationName = organizationName;
    }

    // 创建角色
    public Role createRole(String roleName, boolean isAdmin, String description) {
        Role role = new Role();
        role.setId(generateRoleId());
        role.setName(roleName);
        role.setAdmin(isAdmin);
        role.setDescription(description);
        
        roleDirectory.addRole(role);
        return role;
    }

    // 删除角色
    public boolean deleteRole(String roleId) {
        return roleDirectory.removeRole(roleId);
    }

    // 修改角色
    public boolean updateRole(String roleId, String roleName, boolean isAdmin, String description) {
        Role role = roleDirectory.findRoleById(roleId);
        if (role != null) {
            role.setName(roleName);
            role.setAdmin(isAdmin);
            role.setDescription(description);
            return true;
        }
        return false;
    }

    // 查询角色
    public Role findRoleById(String roleId) {
        return roleDirectory.findRoleById(roleId);
    }

    // 创建人员
    public Person createPerson(String name, String gender, int age, ContactInfo contactInfo) {
        Person person = new Person();
        person.setId(generatePersonId());
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
        person.setContactInfo(contactInfo);
        
        personDirectory.addPerson(person);
        return person;
    }

    // 删除人员
    public boolean deletePerson(String personId) {
        return personDirectory.removePerson(personId);
    }

    // 修改人员
    public boolean updatePerson(String personId, String name, String gender, int age, ContactInfo contactInfo) {
        Person person = personDirectory.findPersonById(personId);
        if (person != null) {
            person.setName(name);
            person.setGender(gender);
            person.setAge(age);
            person.setContactInfo(contactInfo);
            return true;
        }
        return false;
    }

    // 查询人员
    public Person findPersonById(String personId) {
        return personDirectory.findPersonById(personId);
    }

    // 创建用户账户
    public UserAccount createUserAccount(String username, String password, Role role, Person person) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserId(generateUserId());
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setPerson(person);
        userAccount.setOrganizationRef(this);
        
        userAccountDirectory.addUserAccount(userAccount);
        return userAccount;
    }

    // 删除用户账户
    public boolean deleteUserAccount(String userId) {
        return userAccountDirectory.removeUserAccount(userId);
    }

    // 修改用户账户
    public boolean updateUserAccount(String userId, String username, String password, Role role) {
        UserAccount userAccount = userAccountDirectory.findUserAccountById(userId);
        if (userAccount != null) {
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setRole(role);
            return true;
        }
        return false;
    }

    // 查询用户账户
    public UserAccount findUserAccountById(String userId) {
        return userAccountDirectory.findUserAccountById(userId);
    }

    private String generateRoleId() {
        return "ROLE_" + System.currentTimeMillis();
    }

    private String generatePersonId() {
        return "PERSON_" + System.currentTimeMillis();
    }

    private String generateUserId() {
        return "USER_" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    
    public String getOrganizationName() { return organizationName; }
    public void setOrganizationName(String organizationName) { this.organizationName = organizationName; }
    
    public PersonDirectory getPersonDirectory() { return personDirectory; }
    public void setPersonDirectory(PersonDirectory personDirectory) { this.personDirectory = personDirectory; }
    
    public WorkQueue getWorkQueue() { return workQueue; }
    public void setWorkQueue(WorkQueue workQueue) { this.workQueue = workQueue; }
    
    public ContactInfo getContactInfo() { return contactInfo; }
    public void setContactInfo(ContactInfo contactInfo) { this.contactInfo = contactInfo; }
    
    public RoleDirectory getRoleDirectory() { return roleDirectory; }
    public void setRoleDirectory(RoleDirectory roleDirectory) { this.roleDirectory = roleDirectory; }
    
    public UserAccountDirectory getUserAccountDirectory() { return userAccountDirectory; }
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) { this.userAccountDirectory = userAccountDirectory; }
    
    public Person getAdmin() { return admin; }
    public void setAdmin(Person admin) { this.admin = admin; }
    
    public Enterprise getEnterprise() { return enterprise; }
    public void setEnterprise(Enterprise enterprise) { this.enterprise = enterprise; }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
    
    
}