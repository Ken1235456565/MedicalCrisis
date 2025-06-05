package Model.WorkQueue;

import Model.Supplies.SupplyItem;

public class SupplyWorkRequest extends WorkRequest {
    private SupplyItem supplyItem;
    private int quantity;
    private String urgency;
    private String requesterDepartment;
    private String deliveryLocation;
}