/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
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

    @Override
    public String toString() {
        return "CommunityDirectory{" + "directory=" + directory + '}';
    }
    
}
