/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
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

    public void addCity(City c){
        for(String id: this.directory.keySet()){
            City city = this.directory.get(id);
            if(city.getCityName().equals(c.getCityName())){
                JOptionPane.showMessageDialog(null, "City Name already exists" + city.getCityName());
                return;
            }
        }
        this.directory.put(c.getId(), c);
    }
    
    @Override
    public String toString() {
        return "CityDirectory{" + "directory=" + directory + '}';
    }
    
}
