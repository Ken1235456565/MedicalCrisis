package Model.WorkQueue;

import Model.Patient.Patient;
import java.util.Date;

public class ICURequest extends WorkRequest {
    private Patient patient;
    private String icuReason;
    private Date requestedDate;
    private Date bedAssignedDate;
    private String bedId;
    private String attendingPhysician;
}