package Model.Supplies;

import Model.Organization.ClinicalServicesUnit.Patient;
import java.util.Date;

public class ICUbed extends Equipments {
    private String bedId;
    private boolean occupied;
    private Patient patient;
    private Date admissionDate;
    private Date dischargeDate;
}