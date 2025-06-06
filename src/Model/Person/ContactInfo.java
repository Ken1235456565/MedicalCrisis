package Model.Person;


public class ContactInfo {
    private String location;
    private String contactNumber;
    private String contactEmail;

    public ContactInfo(String location, String contactNumber, String contactEmail) {
        this.location = location;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}