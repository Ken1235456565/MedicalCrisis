package Model.RoleProfile;

public class DonationCoordinatorProfile implements RoleProfile {
    private String region;
    
    @Override
    public String getType() {
        return "DonationCoordinator";
    }
}