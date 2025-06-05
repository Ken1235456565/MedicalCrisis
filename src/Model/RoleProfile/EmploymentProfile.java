package Model.RoleProfile;

import Model.Employee.PayrollRecord;
import Model.User.UserAccount;
import Model.Role.Role;

public class EmploymentProfile implements RoleProfile {
    private String employeeId;
    private String position;
    private String department;
    private boolean isActive;
    private PayrollRecord payrollRecord;
    private UserAccount userAccount;
    private Role assignedRole;
    
    @Override
    public String getType() {
        return "Employment";
    }
}