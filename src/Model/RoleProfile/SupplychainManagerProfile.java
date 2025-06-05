package Model.RoleProfile;

public class SupplychainManagerProfile implements RoleProfile {
    private String supplychainManagerID;
    
    @Override
    public String getType() {
        return "SupplychainManager";
    }
}