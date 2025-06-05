package Model.Supplies;

import java.util.List;
import java.util.Date;

public class Delivery {
    private String deliveryId;
    private List<SupplyItem> items;
    private String destination;
    private Date deliveryDate;
    private String status;
    private String vehicleUsed;
    private String driverName;
    private String notes;
    private String recipientName;
}