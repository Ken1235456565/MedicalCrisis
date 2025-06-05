package Model.RoleProfile;

public class EmergencyDispatcherProfile implements RoleProfile {
    private String dispatchZone;
    private String certificationLevel;
    
    @Override
    public String getType() {
        return "EmergencyDispatcher";
    }
}