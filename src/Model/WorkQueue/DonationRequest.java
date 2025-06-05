package Model.WorkQueue;

import Model.Supplies.Donation;
import java.util.List;

public class DonationRequest extends WorkRequest {
    private List<Donation> donations;
    private String requestType;
    private String distributionTarget;
    private String acknowledgementMessage;
    private String urgencyLevel;
    private String targetAmount;
}