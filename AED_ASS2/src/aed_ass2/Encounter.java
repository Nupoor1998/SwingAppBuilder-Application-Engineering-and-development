/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.hospitalmgmt;

/**
 *
 * @author nupoorkorde
 */
public class Encounter extends VitalSigns {
    
    private String problem;
    private String encounterDate;
    private String encounterID;
    private String encounterWith;
    private String diagnosis;
    
    
    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(String encounterID) {
        this.encounterID = encounterID;
    }

    public String getEncounterWith() {
        return encounterWith;
    }

    public void setEncounterWith(String encounterWith) {
        this.encounterWith = encounterWith;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
}
