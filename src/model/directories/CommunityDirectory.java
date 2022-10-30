/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.Community;

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
        this.directory.put(c.getId(), c);
    }

    @Override
    public String toString() {
        return "CommunityDirectory{" + "directory=" + directory + '}';
    }
    
}
