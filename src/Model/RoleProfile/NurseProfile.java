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
}