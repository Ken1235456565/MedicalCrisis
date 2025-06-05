package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.RepairRequest;
import Model.WorkQueue.IssueReport;
import Model.Supplies.EquipmentsCatalog;
import java.util.List;

public class EquipmentTechnicianUnit extends Organization {
    private List<Person> technicians;
    private List<RepairRequest> repairRequests;
    private List<IssueReport> issueReports;
    private String specialization;
    private EquipmentsCatalog equipmentsCatalog;
}