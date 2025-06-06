package Model.RoleProfile;

public class SupplychainManagerProfile implements RoleProfile {
    private String supplychainManagerID;

    public String getSupplychainManagerID() {
        return supplychainManagerID;
    }

    public void setSupplychainManagerID(String supplychainManagerID) {
        this.supplychainManagerID = supplychainManagerID;
    }
    
    
    @Override
    public String getType() {
        return "SupplychainManager";
    }
}