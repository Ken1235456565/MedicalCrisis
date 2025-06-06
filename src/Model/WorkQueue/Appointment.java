package Model.WorkQueue;

import Model.Person.Person;
import Model.Patient.Patient;
import java.util.Date;

public class Appointment extends WorkRequest {
    private String appointmentId;
    private Patient patient;
    private Person doctor;
    private Date appointmentDate;
    private String appointmentTime;
    private int durationMinutes;
    private String appointmentType;
    private String notes;
    private String location;
}