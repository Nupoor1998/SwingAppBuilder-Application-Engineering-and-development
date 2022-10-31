/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.hospitalmgmt;

/**
 *
 * @author nupoorkorde
 */
public class Doctor extends Person{
    
    private String DoctorLicense;
    private String Specialization;

    public String getDoctorLicense() {
        return DoctorLicense;
    }

    public void setDoctorLicense(String DoctorLicense) {
        this.DoctorLicense = DoctorLicense;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }
    
    
}
