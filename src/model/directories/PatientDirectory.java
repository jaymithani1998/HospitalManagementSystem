/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import main.Main;
import model.entities.City;
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
        Patient patient = new Patient();
        patient.setAge(45);
        patient.setCommunityId("com_1");
        patient.setCityId("city_1");
        patient.setHouseId("home_1");
        patient.setName("patient");
        patient.setUserName("patient");
        patient.setPassword("patient");
        patient.setRole("Patient");
        patient.setGender("Female");
    }
    
    public boolean addPatient(Patient p){
        for(String id: this.directory.keySet()){
            Patient pat = this.directory.get(id);
            if(pat.getName().equals(p.getName()) 
                    && pat.getCityId().equals(p.getCityId())
                    && pat.getCommunityId().equals(p.getCommunityId())
                    && pat.getHouseId().equals(p.getHouseId())){
                JOptionPane.showMessageDialog(null, "Patient Already Exists" + pat.getId());
                return false;
            }
        }
        p.setPatientId(Utility.getInstance().getNextPatientId());
        p.setId(p.getPatientId());
        boolean bool = Main.pDirectory.addPerson(p);
        if(bool){
            this.directory.put(p.getId(), p);
            return true;
        }
        System.out.println("Patient Directory"+this.directory);
        return false;
    }
    
    public void updatePatient(Patient patient){
        directory.replace(patient.getId(), patient);
        Main.pDirectory.updatePerson(patient);
    }
    
    public HashMap<String, Patient> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Patient> directory) {
        this.directory = directory;
    }

    
    @Override
    public String toString() {
        return "PatientDirectory{" + "directory=" + directory + '}';
    }
    
    
}
