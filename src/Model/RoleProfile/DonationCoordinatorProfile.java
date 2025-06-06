package Model.RoleProfile;

public class DonationCoordinatorProfile implements RoleProfile {
    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    @Override
    public String getType() {
        return "DonationCoordinator";
    }
}