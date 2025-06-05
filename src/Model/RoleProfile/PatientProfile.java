package Model.RoleProfile;

import java.util.List;

public class PatientProfile implements RoleProfile {
    private String patientId;
    private MedicalRecord medicalRecord;
    private List<MedicationAdministration> medicationHistory;
    
    @Override
    public String getType() {
        return "Patient";
    }
    
    // 内部类 MedicalRecord
    public static class MedicalRecord {
        private String recordId;
        private String diagnosis;
        private String treatment;
    }
    
    // 内部类 MedicationAdministration
    public static class MedicationAdministration {
        private String medicationId;
        private String dosage;
        private String administrationTime;
    }
}