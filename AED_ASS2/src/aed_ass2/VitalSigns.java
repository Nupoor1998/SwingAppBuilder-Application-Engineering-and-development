/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.hospitalmgmt;

/**
 *
 * @author nupoorkorde
 */
public class VitalSigns extends Patient{
    private int temperature;
    private int height;
    private int weight;
    private int respiration_rate;
    private int heart_rate;
    private int blood_pressure;
    private int blood_grp;

    public int getBlood_grp() {
        return blood_grp;
    }

    public void setBlood_grp(int blood_grp) {
        this.blood_grp = blood_grp;
    }
    
    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public int getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }
    

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    public int getRespiration_rate() {
        return respiration_rate;
    }

    public void setRespiration_rate(int respiration_rate) {
        this.respiration_rate = respiration_rate;
    }
    
}
