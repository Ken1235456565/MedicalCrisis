package Model.WorkQueue;

import java.util.Map;
import java.util.Date;

public class CostReport extends WorkRequest {
    private String reportTitle;
    private Date startDate;
    private Date endDate;
    private Map<String, Double> costData;
    private String department;
    private String reportType;
}