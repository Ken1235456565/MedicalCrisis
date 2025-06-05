package Model.RoleProfile;

public class ResourceAnalystProfile implements RoleProfile {
    private String analysisArea;
    
    @Override
    public String getType() {
        return "ResourceAnalyst";
    }
}