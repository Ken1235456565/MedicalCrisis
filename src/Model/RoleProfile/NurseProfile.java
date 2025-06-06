package Model.RoleProfile;

import java.util.List;

public class NurseProfile implements RoleProfile {
    private String nurseType;
    private String licenseNumber;
    private List<ShiftNote> shiftNotes;
    
    @Override
    public String getType() {
        return "Nurse";
    }
    
    // 内部类 ShiftNote
    public static class ShiftNote {
        private String noteId;
        private String content;
        private String date;
    }

    public String getNurseType() {
        return nurseType;
    }

    public void setNurseType(String nurseType) {
        this.nurseType = nurseType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public List<ShiftNote> getShiftNotes() {
        return shiftNotes;
    }

    public void setShiftNotes(List<ShiftNote> shiftNotes) {
        this.shiftNotes = shiftNotes;
    }
    
    
}