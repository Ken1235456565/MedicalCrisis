package Model.RoleProfile;

public class EmergencyResponderProfile implements RoleProfile {
    private String responderType;
    private String certificationLevel;
    private String vehicleAssigned;

    public String getResponderType() {
        return responderType;
    }

    public void setResponderType(String responderType) {
        this.responderType = responderType;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public String getVehicleAssigned() {
        return vehicleAssigned;
    }

    public void setVehicleAssigned(String vehicleAssigned) {
        this.vehicleAssigned = vehicleAssigned;
    }
    
    @Override
    public String getType() {
        return "EmergencyResponder";
    }
}