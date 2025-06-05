package Model.Employee;

import java.util.List;

public class PayrollRecord {
    private String personId;
    private double baseSalary;
    private double bonus;
    private double deductions;
    private List<Payment> paymentHistory;
}