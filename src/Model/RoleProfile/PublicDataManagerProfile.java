package Model.RoleProfile;

import Model.PublicData.HealthStatistics;
import java.util.List;
import java.util.Map;

public class PublicDataManagerProfile implements RoleProfile {
    private String analysisArea;
    private HealthStatistics currentHealthStatistics;
    private Map<String, HealthStatistics> timeSpanHealthData;
    private List<String> standardOrganizationList;
    
    @Override
    public String getType() {
        return "PublicDataManager";
    }
}