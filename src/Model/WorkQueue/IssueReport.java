package Model.WorkQueue;

import Model.Supplies.Equipments;

public class IssueReport extends WorkRequest {
    private String reportId;
    private String reporterName;
    private String contactEmail;
    private String issueCategory;
    private String itemName;
    private int severityLevel;
    private String notes;
    private Equipments equipment;
}