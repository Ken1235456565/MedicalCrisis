package Model.RoleProfile;

import Model.WorkQueue.RepairRequest;
import Model.WorkQueue.IssueReport;
import java.util.List;

public class EquipmentTechnicianProfile implements RoleProfile {
    private String technicianId;
    private String specialization;
    private List<String> certifications;
    private List<RepairRequest> assignedRepairs;
    private List<IssueReport> reportedIssues;
    private int completedRepairs;
    private double skillLevel;
    
    @Override
    public String getType() {
        return "EquipmentTechnician";
    }
}