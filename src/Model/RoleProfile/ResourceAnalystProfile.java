package Model.RoleProfile;

public class ResourceAnalystProfile implements RoleProfile {
    private String analysisArea;

    public String getAnalysisArea() {
        return analysisArea;
    }

    public void setAnalysisArea(String analysisArea) {
        this.analysisArea = analysisArea;
    }
    
    
    @Override
    public String getType() {
        return "ResourceAnalyst";
    }
}