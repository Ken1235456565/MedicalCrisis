package Model.WorkQueue;

import Model.Person.Person;
import java.util.Date;

public class PayrollRequest extends WorkRequest {
    private Person person;
    private Date payPeriodStart;
    private Date payPeriodEnd;
    private Date paymentDate;
    private double hoursWorked;
    private double overtimeHours;
    private double bonus;
    private double deductions;
    private String paymentMethod;
}