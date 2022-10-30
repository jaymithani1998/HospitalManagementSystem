/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.Hospital;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class HospitalDirectory {
    
    private HashMap<String, Hospital> directory;
    public HospitalDirectory(){
        this.directory = new HashMap<String, Hospital>();
    }
    
    public void addHospital(Hospital h){
        for(String id: this.directory.keySet()){
            Hospital hos = this.directory.get(id);
            if(hos.getName().equals(h.getName()) && hos.getCityId().equals(h.getCityId()) && hos.getCommunityId().equals(h.getCommunityId())){
                JOptionPane.showMessageDialog(null, "Hospital Already Exists" + hos.getId());
                return;
            }
        }
        h.setId(Utility.getInstance().getNextHospitalId());
        this.directory.put(h.getId(), h);
        System.out.println("City Dircetory"+this.directory);
    }

    public HashMap<String, Hospital> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Hospital> directory) {
        this.directory = directory;
    }

    
    @Override
    public String toString() {
        return "HospitalDirectory{" + "directory=" + directory + '}';
    }
    
}
