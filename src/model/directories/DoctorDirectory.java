/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import main.Main;
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
    }

    public void addDoctor(Doctor d){
        for(String id: this.directory.keySet()){
            Doctor doc = this.directory.get(id);
            if(doc.getName().equals(d.getName()) && doc.getRole().equals("Doctor")){
                JOptionPane.showMessageDialog(null, "Doctor Already Exists" + doc.getId());
                return;
            }
        }
        d.setId(Utility.getInstance().getNextDoctorId());
        this.directory.put(d.getId(), d);
        Main.pDirectory.addPerson(d);
//        Person p = new Person();
//        p.setName(d.getName());
//        p.setUserName(d.getUserName());
//        p.setPassword(txtPassword.getText());
//        p.setRole("Doctor");
    }

    public HashMap<String, Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Doctor> directory) {
        this.directory = directory;
    }
    
    
    @Override
    public String toString() {
        return "DoctorDirectory{" + "directory=" + directory + '}';
    }
}
