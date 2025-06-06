package Model.Organization;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.WorkQueue.RepairRequest;
import Model.WorkQueue.IssueReport;
import Model.Supplies.EquipmentsCatalog;
import java.util.ArrayList;
import java.util.List;

public class EquipmentTechnicianUnit extends Organization {
    private List<Person> technicians;
    private List<RepairRequest> repairRequests;
    private List<IssueReport> issueReports;
    private String specialization;
    private EquipmentsCatalog equipmentsCatalog;

public EquipmentTechnicianUnit(String name, ContactInfo contactInfo) {
    super(name, contactInfo);
    this.technicians = new ArrayList<>();
    this.repairRequests = new ArrayList<>();
    this.issueReports = new ArrayList<>();
    this.equipmentsCatalog = new EquipmentsCatalog();
    this.specialization = "";  // 可选：你可以设个默认值，或让它在别处赋值
}


    

    public List<Person> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(List<Person> technicians) {
        this.technicians = technicians;
    }

    public List<RepairRequest> getRepairRequests() {
        return repairRequests;
    }

    public void setRepairRequests(List<RepairRequest> repairRequests) {
        this.repairRequests = repairRequests;
    }

    public List<IssueReport> getIssueReports() {
        return issueReports;
    }

    public void setIssueReports(List<IssueReport> issueReports) {
        this.issueReports = issueReports;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public EquipmentsCatalog getEquipmentsCatalog() {
        return equipmentsCatalog;
    }

    public void setEquipmentsCatalog(EquipmentsCatalog equipmentsCatalog) {
        this.equipmentsCatalog = equipmentsCatalog;
    }
    
    
    
    
}