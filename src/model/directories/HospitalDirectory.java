/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.City;
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
        
        Hospital hospital = new Hospital();
        hospital.setName("Hospital1");
        hospital.setCityId("city_1");
        hospital.setCommunityId("com_1");
        addHospital(hospital);

    }
    
    public boolean addHospital(Hospital h){
        for(String id: this.directory.keySet()){
            Hospital hos = this.directory.get(id);
            if(hos.getName().equals(h.getName()) && hos.getCityId().equals(h.getCityId()) && hos.getCommunityId().equals(h.getCommunityId())){
                JOptionPane.showMessageDialog(null, "Hospital Already Exists" + hos.getId());
                return false;
            }
        }
        h.setId(Utility.getInstance().getNextHospitalId());
        this.directory.put(h.getId(), h);
//        System.out.println("City Dircetory"+this.directory);
        return true;
    }
    
    public void updateHospital(Hospital hospital){
        directory.replace(hospital.getId(), hospital);
    }
    
    public String[] getHospitalsForComboBox(){
        ArrayList<String> returnResult = new ArrayList<>();
        for(String id: this.directory.keySet()){
            Hospital h = this.directory.get(id);
            returnResult.add(h.getName()+ ":" + h.getId());
        }
        
        return returnResult.toArray(new String[0]);
    }
    
    public HashMap<String, Hospital> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Hospital> directory) {
        this.directory = directory;
    }

    public void deleteHospital(String c){
        this.directory.remove(c);  
    }
    
    @Override
    public String toString() {
        return "HospitalDirectory{" + "directory=" + directory + '}';
    }
    
}
