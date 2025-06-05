package Model.RoleProfile;

public class DeliveryStaffProfile implements RoleProfile {
    private String vehicleType;
    private String licenseNumber;
    
    @Override
    public String getType() {
        return "DeliveryStaff";
    }
}