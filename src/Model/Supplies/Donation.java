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
}