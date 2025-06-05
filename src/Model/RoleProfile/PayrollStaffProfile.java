package Model.RoleProfile;

public class PayrollStaffProfile implements RoleProfile {
    private String payrollStaffID;
    private String payrollPeriod;
    
    @Override
    public String getType() {
        return "PayrollStaff";
    }
}