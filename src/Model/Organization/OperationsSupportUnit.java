package Model.Organization;

import Model.Person.Person;
import Model.Employee.PayrollRecord;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.Report;
import java.util.List;
import java.util.Date;

public class OperationsSupportUnit extends Organization {
    private String unitName;
    private String fiscalYear;
    private String operationalYear;
    private List<PayrollRecord> payrolls;
    private List<Person> staffList;
    private List<Report> performanceReports;
    private List<WorkRequest> analysisTasks;
    private Date lastPayrollDate;
}