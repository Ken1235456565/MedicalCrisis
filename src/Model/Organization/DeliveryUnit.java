/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.Supplies.Delivery;
import Model.Supplies.DeliveryCatalog;
import Model.Supplies.Vehicle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author tiankaining
 */
public class DeliveryUnit extends Organization {
    private List<Vehicle> vehicleList;                      // 所有车辆信息
    private List<Person> deliveryStaff;                     // 配送人员列表
    private DeliveryCatalog deliveryCatalog;                // 配送任务目录

    private Map<Vehicle, Delivery> vehicleAssignments;      // 当前每辆车正在执行的任务
    private Map<Person, Delivery> staffAssignments;         // 当前每个配送员负责的任务
    private Queue<Delivery> pendingDeliveries;              // 待分配的配送任务队列

    public DeliveryUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo);
        this.vehicleList = new ArrayList<>();
        this.deliveryStaff = new ArrayList<>();
        this.deliveryCatalog = new DeliveryCatalog();

        this.vehicleAssignments = new HashMap<>();
        this.staffAssignments = new HashMap<>();
        this.pendingDeliveries = new LinkedList<>();
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Person> getDeliveryStaff() {
        return deliveryStaff;
    }

    public void setDeliveryStaff(List<Person> deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }

    public DeliveryCatalog getDeliveryCatalog() {
        return deliveryCatalog;
    }

    public void setDeliveryCatalog(DeliveryCatalog deliveryCatalog) {
        this.deliveryCatalog = deliveryCatalog;
    }

    public Map<Vehicle, Delivery> getVehicleAssignments() {
        return vehicleAssignments;
    }

    public void setVehicleAssignments(Map<Vehicle, Delivery> vehicleAssignments) {
        this.vehicleAssignments = vehicleAssignments;
    }

    public Map<Person, Delivery> getStaffAssignments() {
        return staffAssignments;
    }

    public void setStaffAssignments(Map<Person, Delivery> staffAssignments) {
        this.staffAssignments = staffAssignments;
    }

    public Queue<Delivery> getPendingDeliveries() {
        return pendingDeliveries;
    }

    public void setPendingDeliveries(Queue<Delivery> pendingDeliveries) {
        this.pendingDeliveries = pendingDeliveries;
    }
    
    
}
