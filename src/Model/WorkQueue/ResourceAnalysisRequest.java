package Model.WorkQueue;

import java.util.Map;
import java.util.Date;

public class ResourceAnalysisRequest extends WorkRequest {
    private String analysisType;
    private Date analysisPeriodStart;
    private Date analysisPeriodEnd;
    private String department;
    private Map<String, Object> analysisCriteria;
    private String priority;
    private String analystAssigned;
}