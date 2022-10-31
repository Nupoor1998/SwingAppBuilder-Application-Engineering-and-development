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
public class SystemadminDirectory {
    
    private ArrayList<SystemAdminclass> adminDirectory = new ArrayList<>();
    
    public SystemadminDirectory(){
        this.adminDirectory = new ArrayList<>();      
    }

    public ArrayList<SystemAdminclass> getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(ArrayList<SystemAdminclass> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
    
    public SystemAdminclass addSystemAdmin(){
       SystemAdminclass adME = new SystemAdminclass();
       adminDirectory.add(adME);
       return adME;
    
    }
}
