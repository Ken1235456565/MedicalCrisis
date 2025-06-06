package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.AppointmentSchedule;
import Model.Supplies.ICUbedCatalog;
import Model.Supplies.SupplyItemCatalog;
import Model.EcoSystem;
import Model.Patient.Patient;
import Model.Patient.PatientDirectory;
import Model.Person.ContactInfo;
import java.util.ArrayList;
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
    
    public ClinicalServicesUnit(String name, ContactInfo contactInfo, boolean emergencyReady) {
        super(name, contactInfo);  // 调用父类 Organization 的有参构造器
        this.unitName = name;
        this.medicalStaff = new ArrayList<>();
        this.patientList = new ArrayList<>();
        this.appointmentSchedule = new AppointmentSchedule();
        this.activeRequests = new ArrayList<>();
        this.ICUbedCatalog = new ICUbedCatalog();
        this.patientDirectory = new PatientDirectory();
        this.supplyItemCatalog = new SupplyItemCatalog();
        this.ecoSystem = EcoSystem.getInstance();  // 假设为单例模式
        this.emergencyReady = emergencyReady;
    }

public ClinicalServicesUnit(String name) {
    super(name);  // 调用父类 Organization 的构造函数设置组织名
    this.unitName = name;

    this.medicalStaff = new ArrayList<>();
    this.patientList = new ArrayList<>();
    this.appointmentSchedule = new AppointmentSchedule();
    this.activeRequests = new ArrayList<>();
    this.emergencyReady = false;

    this.ICUbedCatalog = new ICUbedCatalog();
    this.patientDirectory = new PatientDirectory();
    this.supplyItemCatalog = new SupplyItemCatalog();

    this.ecoSystem = EcoSystem.getInstance(); // 也可以在外部注入
}


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public List<Person> getMedicalStaff() {
        return medicalStaff;
    }

    public void setMedicalStaff(List<Person> medicalStaff) {
        this.medicalStaff = medicalStaff;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public AppointmentSchedule getAppointmentSchedule() {
        return appointmentSchedule;
    }

    public void setAppointmentSchedule(AppointmentSchedule appointmentSchedule) {
        this.appointmentSchedule = appointmentSchedule;
    }

    public List<WorkRequest> getActiveRequests() {
        return activeRequests;
    }

    public void setActiveRequests(List<WorkRequest> activeRequests) {
        this.activeRequests = activeRequests;
    }

    public boolean isEmergencyReady() {
        return emergencyReady;
    }

    public void setEmergencyReady(boolean emergencyReady) {
        this.emergencyReady = emergencyReady;
    }

    public ICUbedCatalog getICUbedCatalog() {
        return ICUbedCatalog;
    }

    public void setICUbedCatalog(ICUbedCatalog ICUbedCatalog) {
        this.ICUbedCatalog = ICUbedCatalog;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public SupplyItemCatalog getSupplyItemCatalog() {
        return supplyItemCatalog;
    }

    public void setSupplyItemCatalog(SupplyItemCatalog supplyItemCatalog) {
        this.supplyItemCatalog = supplyItemCatalog;
    }

    public EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public void setEcoSystem(EcoSystem ecoSystem) {
        this.ecoSystem = ecoSystem;
    }

    
}