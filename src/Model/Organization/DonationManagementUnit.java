package Model.Organization;

import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.Supplies.DonationCatalog;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class DonationManagementUnit extends Organization {
    private DonationCatalog donationRecords;
    private List<Person> donorPersonList;
    private Map<String, Integer> donationInventory;
    private List<WorkRequest> donationRequests;
    private Date lastDonationEventDate;
    private double totalFundsRaised;
}