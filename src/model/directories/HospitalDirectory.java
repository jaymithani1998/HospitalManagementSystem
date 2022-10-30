/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.Hospital;

/**
 *
 * @author jaymithani
 */
public class HospitalDirectory {
    
    private HashMap<String, Hospital> directory;
    public HospitalDirectory(){
        this.directory = new HashMap<String, Hospital>();
    }

    @Override
    public String toString() {
        return "HospitalDirectory{" + "directory=" + directory + '}';
    }
    
}
