/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
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
    
    public void addHouse(House h){
        h.setId(Utility.getInstance().getNextHouseId());
        this.directory.put(h.getId(), h);
    }

    public HashMap<String, House> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, House> directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "HouseDirectory{" + "directory=" + directory + '}';
    }
    
    
}
