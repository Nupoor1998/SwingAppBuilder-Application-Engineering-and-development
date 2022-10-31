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
public class DoctorDirectory {
    
    private ArrayList<Doctor>doctordirectory;
    
    public DoctorDirectory() {
        this.doctordirectory = new ArrayList<Doctor>();
        
        
    }

    public ArrayList<Doctor> getDoctordirectory() {
        return doctordirectory;
    }

    public void setDoctordirectory(ArrayList<Doctor> doctordirectory) {
        this.doctordirectory = doctordirectory;
    }
    
    public Doctor addDoctor(){
    Doctor doctor= new Doctor();
        doctordirectory.add(doctor);
        return doctor;
    }
}
