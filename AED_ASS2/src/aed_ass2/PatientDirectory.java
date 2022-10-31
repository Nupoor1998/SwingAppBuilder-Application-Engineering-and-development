/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.hospitalmgmt;

import java.util.ArrayList;

/**
 *
 * @author nupoorkorde
 */
public class PatientDirectory {
    private ArrayList<Patient>patientdirectory;
    
    public PatientDirectory() {
        this.patientdirectory = new ArrayList<Patient>();
        
        
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public Patient addnewpatients(){
        Patient addnewpatient = new Patient();
        patientdirectory.add(addnewpatient);
        return addnewpatient;
        
    }
    
}
