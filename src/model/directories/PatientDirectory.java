/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.Patient;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class PatientDirectory {
    
    private HashMap<String, Patient> directory;
    
    public PatientDirectory(){
        this.directory = new HashMap<String, Patient>();
    }
    
    public void addPatient(Patient p){
        for(String id: this.directory.keySet()){
            Patient pat = this.directory.get(id);
            if(pat.getName().equals(p.getName())){
                JOptionPane.showMessageDialog(null, "Patient Already Exists" + pat.getId());
                return;
            }
        }
        p.setId(Utility.getInstance().getNextPatientId());
        this.directory.put(p.getId(), p);
        System.out.println("Patient Directory"+this.directory);
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "directory=" + directory + '}';
    }
    
    
}
