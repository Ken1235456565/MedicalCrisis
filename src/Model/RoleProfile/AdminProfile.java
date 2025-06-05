package Model.RoleProfile;

public class AdminProfile implements RoleProfile {
    @Override
    public String getType() {
        return "Admin";
    }
}