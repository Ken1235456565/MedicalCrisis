package Model.RoleProfile;

public class PayrollStaffProfile implements RoleProfile {
    private String payrollStaffID;
    private String payrollPeriod;

    public String getPayrollStaffID() {
        return payrollStaffID;
    }

    public void setPayrollStaffID(String payrollStaffID) {
        this.payrollStaffID = payrollStaffID;
    }

    public String getPayrollPeriod() {
        return payrollPeriod;
    }

    public void setPayrollPeriod(String payrollPeriod) {
        this.payrollPeriod = payrollPeriod;
    }
    
    
    @Override
    public String getType() {
        return "PayrollStaff";
    }
}