package Model.RoleProfile;

public class DeliveryStaffProfile implements RoleProfile {
    private String vehicleType;
    private String licenseNumber;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    
    @Override
    public String getType() {
        return "DeliveryStaff";
    }
}