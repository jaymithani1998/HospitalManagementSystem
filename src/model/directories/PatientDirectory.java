/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.Patient;

/**
 *
 * @author jaymithani
 */
public class PatientDirectory {
    
    private HashMap<String, Patient> directory;
    
    public PatientDirectory(){
        this.directory = new HashMap<String, Patient>();
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "directory=" + directory + '}';
    }
    
    
}
