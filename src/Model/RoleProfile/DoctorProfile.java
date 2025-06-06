package Model.RoleProfile;

public class DoctorProfile implements RoleProfile {
    private String specialization;
    private String licenseNumber;
    
    @Override
    public String getType() {
        return "Doctor";
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    
}