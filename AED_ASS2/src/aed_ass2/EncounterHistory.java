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
public class EncounterHistory {
    
    private ArrayList<Encounter>EncounterHistory = new ArrayList<>();
    
    public EncounterHistory(){
        this.EncounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }
    public Encounter addEncounterHistory(){
    Encounter encounter = new Encounter();
    EncounterHistory.add(encounter);
    return encounter;
    
    }
}
    