/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.Doctor;

/**
 *
 * @author jaymithani
 */
public class DoctorDirectory {
    private HashMap<String,Doctor> directory;
    
    public DoctorDirectory(){
        this.directory = new HashMap<String,Doctor>();
    }

    @Override
    public String toString() {
        return "DoctorDirectory{" + "directory=" + directory + '}';
    }
}
