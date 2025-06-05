package Model.WorkQueue;

import Model.Supplies.Delivery;
import Model.Person.Person;

public class DeliveryAssignmentRequest extends WorkRequest {
    private Delivery delivery;
    private Person assignedDriver;
    private String assignedVehicle;
    private String dispatchNotes;
}