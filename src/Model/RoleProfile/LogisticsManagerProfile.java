package Model.RoleProfile;

public class LogisticsManagerProfile implements RoleProfile {
    private String logisticsManagerID;

    public String getLogisticsManagerID() {
        return logisticsManagerID;
    }

    public void setLogisticsManagerID(String logisticsManagerID) {
        this.logisticsManagerID = logisticsManagerID;
    }
    
    
    @Override
    public String getType() {
        return "LogisticsManager";
    }
}