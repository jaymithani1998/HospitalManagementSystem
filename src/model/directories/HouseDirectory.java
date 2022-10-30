/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.City;
import model.entities.Community;
import model.entities.Hospital;
import model.entities.House;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class HouseDirectory {
    private HashMap<String, House> directory;
    
    public HouseDirectory(){
        this.directory = new HashMap<String, House>();
    }
    
    public boolean addHouse(House h){
        for(String id: this.directory.keySet()){
            House house = this.directory.get(id);
            if(house.getAptNumber() ==h.getAptNumber() && house.getCityId().equals(h.getCityId()) && house.getCommunityId().equals(h.getCommunityId())){
                JOptionPane.showMessageDialog(null, "House Already Exists" + house.getId());
                return false;
            }
        }
        h.setId(Utility.getInstance().getNextHouseId());
        this.directory.put(h.getId(), h);
        return true;
    }
    
    public void updateHouse(House house){
        directory.replace(house.getId(), house);
    }
    
    public HashMap<String, House> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, House> directory) {
        this.directory = directory;
    }
    
    public String[] getHousesForComboBox(String communityId){
        ArrayList<String> returnResult = new ArrayList<>();
        for(String id: this.directory.keySet()){
            House house = this.directory.get(id);
            if(house.getCommunityId().equals(communityId)){
                returnResult.add(house.getAptNumber()+ ":" + house.getId());
            }
        }
        
        return returnResult.toArray(new String[0]);
    }
    
    @Override
    public String toString() {
        return "HouseDirectory{" + "directory=" + directory + '}';
    }
    
    
}
