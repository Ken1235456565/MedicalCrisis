package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.MissionCatalog;
import Model.Supplies.DeliveryCatalog;
import Model.Patient.Patient;
import Model.Person.ContactInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmergencyResponseUnit extends Organization {
    private List<Person> emergencyStaff;
    private List<Patient> emergencyPatients;
    private Map<String, Boolean> emergencyVehicleStatus;
    private List<WorkRequest> emergencyCalls;
    private int alertLevel;
    private Map<String, Integer> responseTimeMetrics;
    private DeliveryCatalog deliveryCatalog;
    private MissionCatalog missionCatalog;
    
    public EmergencyResponseUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo); 
        this.emergencyStaff = new ArrayList<>();
        this.emergencyPatients = new ArrayList<>();
        this.emergencyVehicleStatus = new HashMap<>();
        this.emergencyCalls = new ArrayList<>();
        this.alertLevel = 0;
        this.responseTimeMetrics = new HashMap<>();
        this.deliveryCatalog = new DeliveryCatalog();
        this.missionCatalog = new MissionCatalog();
    }

public EmergencyResponseUnit(String organizationName) {
    super(organizationName, null);  // 如果你能接受 contactInfo 为 null
    this.emergencyStaff = new ArrayList<>();
    this.emergencyPatients = new ArrayList<>();
    this.emergencyVehicleStatus = new HashMap<>();
    this.emergencyCalls = new ArrayList<>();
    this.alertLevel = 0;
    this.responseTimeMetrics = new HashMap<>();
    this.deliveryCatalog = new DeliveryCatalog();
    this.missionCatalog = new MissionCatalog();
}

    public List<Person> getEmergencyStaff() {
        return emergencyStaff;
    }

    public void setEmergencyStaff(List<Person> emergencyStaff) {
        this.emergencyStaff = emergencyStaff;
    }

    public List<Patient> getEmergencyPatients() {
        return emergencyPatients;
    }

    public void setEmergencyPatients(List<Patient> emergencyPatients) {
        this.emergencyPatients = emergencyPatients;
    }

    public Map<String, Boolean> getEmergencyVehicleStatus() {
        return emergencyVehicleStatus;
    }

    public void setEmergencyVehicleStatus(Map<String, Boolean> emergencyVehicleStatus) {
        this.emergencyVehicleStatus = emergencyVehicleStatus;
    }

    public List<WorkRequest> getEmergencyCalls() {
        return emergencyCalls;
    }

    public void setEmergencyCalls(List<WorkRequest> emergencyCalls) {
        this.emergencyCalls = emergencyCalls;
    }

    public int getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(int alertLevel) {
        this.alertLevel = alertLevel;
    }

    public Map<String, Integer> getResponseTimeMetrics() {
        return responseTimeMetrics;
    }

    public void setResponseTimeMetrics(Map<String, Integer> responseTimeMetrics) {
        this.responseTimeMetrics = responseTimeMetrics;
    }

    public DeliveryCatalog getDeliveryCatalog() {
        return deliveryCatalog;
    }

    public void setDeliveryCatalog(DeliveryCatalog deliveryCatalog) {
        this.deliveryCatalog = deliveryCatalog;
    }

    public MissionCatalog getMissionCatalog() {
        return missionCatalog;
    }

    public void setMissionCatalog(MissionCatalog missionCatalog) {
        this.missionCatalog = missionCatalog;
    }

    
}