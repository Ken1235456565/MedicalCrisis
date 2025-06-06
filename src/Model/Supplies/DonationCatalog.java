package Model.Supplies;

import java.util.ArrayList;
import java.util.List;

public class DonationCatalog {
    private List<Donation> donationList;

    public DonationCatalog() {
        this.donationList = new ArrayList<>();
    }
    public List<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(List<Donation> donationList) {
        this.donationList = donationList;
    }
    
    
}