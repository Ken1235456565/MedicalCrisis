package Model.Supplies;

import Model.Person.Person;
import java.util.List;
import java.util.Date;

public class Donation {
    private String donationId;
    private Person donorPerson;
    private Date donationDate;
    private double monetaryAmount;
    private List<DonatedItem> donatedItems;
    private String purpose;
    private String notes;
    private String status;

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public Person getDonorPerson() {
        return donorPerson;
    }

    public void setDonorPerson(Person donorPerson) {
        this.donorPerson = donorPerson;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public double getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(double monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    public List<DonatedItem> getDonatedItems() {
        return donatedItems;
    }

    public void setDonatedItems(List<DonatedItem> donatedItems) {
        this.donatedItems = donatedItems;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}