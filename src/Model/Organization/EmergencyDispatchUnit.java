/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Patient.Patient;
import Model.Person.ContactInfo;
import Model.Person.Person;
import Model.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tiankaining
 */
public class EmergencyDispatchUnit extends Organization {
    private List<Person> emergencyStaff;
    private List<Patient> emergencyPatients;
    private Map<String, Boolean> emergencyVehicleStatus;
    private List<WorkRequest> dispatchQueue;
    private String dispatchZone;

    public EmergencyDispatchUnit(String name, ContactInfo contactInfo) {
        super(name, contactInfo);
        this.emergencyStaff = new ArrayList<>();
        this.emergencyPatients = new ArrayList<>();
        this.dispatchQueue = new ArrayList<>();
        this.dispatchZone = "Default Zone"; // 可根据实际需求传参或后设
    }



    // 可选：你可以添加具体方法

    public List<WorkRequest> getDispatchQueue() {
        return dispatchQueue;
    }

    public void setDispatchQueue(List<WorkRequest> dispatchQueue) {
        this.dispatchQueue = dispatchQueue;
    }

    public String getDispatchZone() {
        return dispatchZone;
    }

    public void setDispatchZone(String dispatchZone) {
        this.dispatchZone = dispatchZone;
    }

    public List<Person> getEmergencyStaff() {
        return emergencyStaff;
    }

    public void setEmergencyStaff(List<Person> emergencyStaff) {
        this.emergencyStaff = emergencyStaff;
    }

    public List<Patient> getEmergencyPatients() {
        return emergencyPatients;
    }

    public void setEmergencyPatients(List<Patient> emergencyPatients) {
        this.emergencyPatients = emergencyPatients;
    }

    public Map<String, Boolean> getEmergencyVehicleStatus() {
        return emergencyVehicleStatus;
    }

    public void setEmergencyVehicleStatus(Map<String, Boolean> emergencyVehicleStatus) {
        this.emergencyVehicleStatus = emergencyVehicleStatus;
    }

}

