package Model.Organization;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import Model.Supplies.DonationCatalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;

public class DonationManagementUnit extends Organization {
    private DonationCatalog donationRecords;
    private List<Person> donorPersonList;
    private Map<String, Integer> donationInventory;
    private List<WorkRequest> donationRequests;
    private Date lastDonationEventDate;
    private double totalFundsRaised;
    
    public DonationManagementUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo); 
        this.donationRecords = new DonationCatalog();
        this.donorPersonList = new ArrayList<>();
        this.donationInventory = new HashMap<>();
        this.donationRequests = new ArrayList<>();
        this.lastDonationEventDate = null;
        this.totalFundsRaised = 0.0;
    }



    public DonationCatalog getDonationRecords() {
        return donationRecords;
    }

    public void setDonationRecords(DonationCatalog donationRecords) {
        this.donationRecords = donationRecords;
    }

    public List<Person> getDonorPersonList() {
        return donorPersonList;
    }

    public void setDonorPersonList(List<Person> donorPersonList) {
        this.donorPersonList = donorPersonList;
    }

    public Map<String, Integer> getDonationInventory() {
        return donationInventory;
    }

    public void setDonationInventory(Map<String, Integer> donationInventory) {
        this.donationInventory = donationInventory;
    }

    public List<WorkRequest> getDonationRequests() {
        return donationRequests;
    }

    public void setDonationRequests(List<WorkRequest> donationRequests) {
        this.donationRequests = donationRequests;
    }

    public Date getLastDonationEventDate() {
        return lastDonationEventDate;
    }

    public void setLastDonationEventDate(Date lastDonationEventDate) {
        this.lastDonationEventDate = lastDonationEventDate;
    }

    public double getTotalFundsRaised() {
        return totalFundsRaised;
    }

    public void setTotalFundsRaised(double totalFundsRaised) {
        this.totalFundsRaised = totalFundsRaised;
    }
    
    
}