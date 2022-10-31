/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import main.Main;
import model.entities.City;
import model.entities.Doctor;
import model.entities.Person;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class DoctorDirectory {
    private HashMap<String,Doctor> directory;
    
    public DoctorDirectory(){
        this.directory = new HashMap<String,Doctor>();
        
        Doctor d = new Doctor();
        d.setExperience(10);
        d.setGender("Male");
        d.setSpecialization("Surgery");
        d.setName("doctor");
        d.setUserName("doctor");
        d.setPassword("doctor");
        d.setRole("Doctor");
        d.setHospitalId("hosp_1");
        addDoctor(d);
    }

    public boolean addDoctor(Doctor d){
        for(String id: this.directory.keySet()){
            Doctor doc = this.directory.get(id);
            if(doc.getName().equals(d.getName()) && doc.getRole().equals("Doctor")){
                JOptionPane.showMessageDialog(null, "Doctor Already Exists" + doc.getId());
                return false;
            }
        }
        d.setId(Utility.getInstance().getNextDoctorId());
        boolean bool = Main.pDirectory.addPerson(d);
        if(bool){
            this.directory.put(d.getId(), d);
            return true;
        }
//        Person p = new Person();
//        p.setName(d.getName());
//        p.setUserName(d.getUserName());
//        p.setPassword(txtPassword.getText());
//        p.setRole("Doctor");
        return false;
    }
    
    public void updateDoctor(Doctor doctor){
        directory.replace(doctor.getId(), doctor);
        Main.pDirectory.updatePerson(doctor);
    }
    
    public HashMap<String, Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Doctor> directory) {
        this.directory = directory;
    }
    
    public void deleteDoctor(String c){
        this.directory.remove(c);  
    }
    
    @Override
    public String toString() {
        return "DoctorDirectory{" + "directory=" + directory + '}';
    }
}
