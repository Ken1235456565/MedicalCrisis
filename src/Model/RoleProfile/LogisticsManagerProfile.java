package Model.RoleProfile;

public class LogisticsManagerProfile implements RoleProfile {
    private String logisticsManagerID;
    
    @Override
    public String getType() {
        return "LogisticsManager";
    }
}