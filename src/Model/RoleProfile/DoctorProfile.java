package Model.RoleProfile;

public class DoctorProfile implements RoleProfile {
    private String specialization;
    private String licenseNumber;
    
    @Override
    public String getType() {
        return "Doctor";
    }
}