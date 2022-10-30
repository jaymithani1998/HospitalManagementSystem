/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.City;
import util.Utility;
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
                JOptionPane.showMessageDialog(null, "City Name already exists: " + city.getCityName());
                return;
            }
        }
        c.setId(Utility.getInstance().getNextCityId());
        this.directory.put(c.getId(), c);
        System.out.println("City Dircetory"+this.directory);
    }

    public HashMap<String, City> getDirectory() {
        return directory;
    }

    public String[] getCitiesForComboBox(){
        ArrayList<String> returnResult = new ArrayList<>();
        for(String id: this.directory.keySet()){
            City city = this.directory.get(id);
            returnResult.add(city.getCityName() + ":" + city.getId());
        }
        
        return returnResult.toArray(new String[0]);
    }
    
    public void setDirectory(HashMap<String, City> directory) {
        this.directory = directory;
    }
    
    @Override
    public String toString() {
        return "CityDirectory{" + "directory=" + directory + '}';
    }
    
}
