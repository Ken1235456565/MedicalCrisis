package Model.WorkQueue;

import Model.Supplies.Equipments;
import Model.Person.Person;

public class RepairRequest extends WorkRequest {
    private String repairRequestId;
    private Equipments equipment;
    private String reporterName;
    private String issueCategory;
    private int priorityLevel;
    private int severityLevel;
    private Person assignedTechnician;
    private String contactEmail;
}