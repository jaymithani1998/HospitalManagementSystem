/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.util.HashMap;
import model.entities.Encounter;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class EncounterDirectory {
    private HashMap<String, Encounter> directory;
    
    public EncounterDirectory(){
        this.directory = new HashMap<String, Encounter>();
    }

    public void addEncounter(Encounter e){
        e.setId(Utility.getInstance().getNextEncounterId());
        this.directory.put(e.getId(), e);
    }
    
    @Override
    public String toString() {
        return "EncounterDirectory{" + "directory=" + directory + '}';
    }
    
}
