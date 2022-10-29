/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.City;

/**
 *
 * @author jaymithani
 */
public class CityDirectory {
    
    private HashMap<String, City> directory;
    
    public CityDirectory(){
        this.directory = new HashMap<String, City>();
    }

    @Override
    public String toString() {
        return "CityDirectory{" + "directory=" + directory + '}';
    }
    
}
