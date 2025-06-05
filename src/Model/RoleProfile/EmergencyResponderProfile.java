package Model.RoleProfile;

public class EmergencyResponderProfile implements RoleProfile {
    private String responderType;
    private String certificationLevel;
    private String vehicleAssigned;
    
    @Override
    public String getType() {
        return "EmergencyResponder";
    }
}