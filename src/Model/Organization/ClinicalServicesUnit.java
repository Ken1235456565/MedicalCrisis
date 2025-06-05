package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.AppointmentSchedule;
import Model.Supplies.ICUbedCatalog;
import Model.Supplies.SupplyItemCatalog;
import Model.EcoSystem;
import java.util.List;

public class ClinicalServicesUnit extends Organization {
    private String unitName;
    private List<Person> medicalStaff;
    private List<Patient> patientList;
    private AppointmentSchedule appointmentSchedule;
    private List<WorkRequest> activeRequests;
    private boolean emergencyReady;
    private ICUbedCatalog ICUbedCatalog;
    private PatientDirectory patientDirectory;
    private SupplyItemCatalog supplyItemCatalog;
    private EcoSystem ecoSystem;
    
    // 内部类
    public static class Patient {
        private String patientId;
        private String name;
        private String condition;
    }
    
    public static class PatientDirectory {
        private List<Patient> patients;
    }
}