package Model.RoleProfile;

public class EmergencyDispatcherProfile implements RoleProfile {
    private String dispatchZone;
    private String certificationLevel;

    public String getDispatchZone() {
        return dispatchZone;
    }

    public void setDispatchZone(String dispatchZone) {
        this.dispatchZone = dispatchZone;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }
    
    @Override
    public String getType() {
        return "EmergencyDispatcher";
    }
}