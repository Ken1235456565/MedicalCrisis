package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.MissionCatalog;
import Model.Supplies.DeliveryCatalog;
import Model.Organization.ClinicalServicesUnit.Patient;
import java.util.List;
import java.util.Map;

public class EmergencyResponseUnit extends Organization {
    private String unitName;
    private List<Person> emergencyStaff;
    private List<Patient> emergencyPatients;
    private Map<String, Boolean> emergencyVehicleStatus;
    private List<WorkRequest> emergencyCalls;
    private int alertLevel;
    private Map<String, Integer> responseTimeMetrics;
    private DeliveryCatalog deliveryCatalog;
    private MissionCatalog missionCatalog;
}