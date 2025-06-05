package Model.Person;

import Model.RoleProfile.RoleProfile;
import java.util.Date;
import java.util.Map;

public class Person {
    private String id;
    private String gender;
    private int age;
    private String name;
    private Date dateOfBirth;
    private ContactInfo contactInfo;
    private Map<String, RoleProfile> roleProfiles;
}