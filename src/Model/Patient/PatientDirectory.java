/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiankaining
 */
public class PatientDirectory {
    private List<Patient> patients;

    public PatientDirectory() {
        this.patients = new ArrayList<>();
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}

