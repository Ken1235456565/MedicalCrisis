package Model.Organization;

import Model.Person.ContactInfo;
import Model.Supplies.SupplyItem;
import Model.Supplies.SupplyItemCatalog;
import Model.Supplies.DeliveryCatalog;
import java.util.List;
import java.util.Map;
import java.util.Date;
import Model.Supplies.Vehicle;
import Model.Supplies.VehicleCatalog;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.WorkRequestDirectory;
import java.util.ArrayList;
import java.util.HashMap;

public class SupplyChainManagementUnit extends Organization {
    private SupplyItemCatalog supplyItemCatalog; 
    private Date lastAuditDate;
    private String warehouseLocation;
    private Map<String, Double> itemThresholds; 
    private DeliveryCatalog deliveryCatalog; 
    private VehicleCatalog vehicleCatalog; 
    private List<SupplyItem> dispatchQueue; 
    private Map<String, Boolean> routeAvailability; 
    private WorkRequestDirectory workRequestDirectory; 

    public SupplyChainManagementUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo); // 调用父类 Organization 构造器

        this.supplyItemCatalog = new SupplyItemCatalog();
        this.lastAuditDate = new Date(); // 默认当前时间
        this.warehouseLocation = contactInfo != null ? contactInfo.getLocation() : "Unknown";
        this.itemThresholds = new HashMap<>();
        this.deliveryCatalog = new DeliveryCatalog();
        this.vehicleCatalog = new VehicleCatalog();
        this.dispatchQueue = new ArrayList<>();
        this.routeAvailability = new HashMap<>();
        this.workRequestDirectory = new WorkRequestDirectory();
    }

    public SupplyItemCatalog getSupplyItemCatalog() {
        return supplyItemCatalog;
    }

    public void setSupplyItemCatalog(SupplyItemCatalog supplyItemCatalog) {
        this.supplyItemCatalog = supplyItemCatalog;
    }

    public Date getLastAuditDate() {
        return lastAuditDate;
    }

    public void setLastAuditDate(Date lastAuditDate) {
        this.lastAuditDate = lastAuditDate;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public Map<String, Double> getItemThresholds() {
        return itemThresholds;
    }

    public void setItemThresholds(Map<String, Double> itemThresholds) {
        this.itemThresholds = itemThresholds;
    }

    public DeliveryCatalog getDeliveryCatalog() {
        return deliveryCatalog;
    }

    public void setDeliveryCatalog(DeliveryCatalog deliveryCatalog) {
        this.deliveryCatalog = deliveryCatalog;
    }

    public VehicleCatalog getVehicleCatalog() {
        return vehicleCatalog;
    }

    public void setVehicleCatalog(VehicleCatalog vehicleCatalog) {
        this.vehicleCatalog = vehicleCatalog;
    }

    public List<SupplyItem> getDispatchQueue() {
        return dispatchQueue;
    }

    public void setDispatchQueue(List<SupplyItem> dispatchQueue) {
        this.dispatchQueue = dispatchQueue;
    }

    public Map<String, Boolean> getRouteAvailability() {
        return routeAvailability;
    }

    public void setRouteAvailability(Map<String, Boolean> routeAvailability) {
        this.routeAvailability = routeAvailability;
    }

    public WorkRequestDirectory getWorkRequestDirectory() {
        return workRequestDirectory;
    }

    public void setWorkRequestDirectory(WorkRequestDirectory workRequestDirectory) {
        this.workRequestDirectory = workRequestDirectory;
    }

    
}