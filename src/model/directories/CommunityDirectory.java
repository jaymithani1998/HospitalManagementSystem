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
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class CommunityDirectory {
    private HashMap<String, Community> directory;
    
    public CommunityDirectory(){
        this.directory = new HashMap<String,Community>();
    }
    
    public void addCommunity(Community c){
        for(String id: this.directory.keySet()){
            Community com = this.directory.get(id);
            if(com.getCityName().equals(c.getCityName()) && com.getName().equals(c.getName())){
                JOptionPane.showMessageDialog(null, "Community Already Exist" + com.getId());
                return;
            }
        }
        c.setId(Utility.getInstance().getNextCommunityId());
        this.directory.put(c.getId(), c);
        System.out.println("Community Directory:"+this.directory);
    }
    
    public String[] getCommunitiesForComboBox(String cityId){
        ArrayList<String> returnResult = new ArrayList<>();
        for(String id: this.directory.keySet()){
            Community community = this.directory.get(id);
            if(community.getCityId().equals(cityId)){
                returnResult.add(community.getName()+ ":" + community.getId());
            }
        }
        
        return returnResult.toArray(new String[0]);
    }

    public HashMap<String, Community> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Community> directory) {
        this.directory = directory;
    }
    
    @Override
    public String toString() {
        return "CommunityDirectory{" + "directory=" + directory + '}';
    }
    
}
