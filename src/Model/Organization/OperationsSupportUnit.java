package Model.Organization;

import Model.Person.Person;
import Model.Employee.PayrollRecord;
import Model.Person.ContactInfo;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.Report;
import java.util.ArrayList;
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
    
    public OperationsSupportUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo);
        this.unitName = name;
        this.fiscalYear = "2025";
        this.operationalYear = "2025";
        this.payrolls = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.performanceReports = new ArrayList<>();
        this.analysisTasks = new ArrayList<>();
        this.lastPayrollDate = null;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getOperationalYear() {
        return operationalYear;
    }

    public void setOperationalYear(String operationalYear) {
        this.operationalYear = operationalYear;
    }

    public List<PayrollRecord> getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(List<PayrollRecord> payrolls) {
        this.payrolls = payrolls;
    }

    public List<Person> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Person> staffList) {
        this.staffList = staffList;
    }

    public List<Report> getPerformanceReports() {
        return performanceReports;
    }

    public void setPerformanceReports(List<Report> performanceReports) {
        this.performanceReports = performanceReports;
    }

    public List<WorkRequest> getAnalysisTasks() {
        return analysisTasks;
    }

    public void setAnalysisTasks(List<WorkRequest> analysisTasks) {
        this.analysisTasks = analysisTasks;
    }

    public Date getLastPayrollDate() {
        return lastPayrollDate;
    }

    public void setLastPayrollDate(Date lastPayrollDate) {
        this.lastPayrollDate = lastPayrollDate;
    }

    
}