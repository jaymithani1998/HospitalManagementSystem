/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.VitalSigns;

/**
 *
 * @author jaymithani
 */
public class VitalSignsDirectory {
    
    private HashMap<String, VitalSigns> directory;
    
    public VitalSignsDirectory(){
        this.directory = new HashMap<String, VitalSigns>();
    }

//    public void addVitals(VitalSigns v){
//        
//        this.directory.put(v.getId(), v);
//        System.out.println("City Dircetory"+this.directory);
//    }
//    
    @Override
    public String toString() {
        return "VitalSignsDirectory{" + "directory=" + directory + '}';
    }
    
    
}
