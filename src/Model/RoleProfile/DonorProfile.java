package Model.RoleProfile;

import Model.Supplies.Donation;
import java.util.List;

public class DonorProfile implements RoleProfile {
    private List<Donation> donationHistory;
    private double totalDonationAmount;
    private String donorType;
    private boolean isRecurringDonor;
    
    @Override
    public String getType() {
        return "Donor";
    }
}