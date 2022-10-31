/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.sql.Timestamp;
import java.util.HashMap;
import model.entities.Encounter;
import model.entities.VitalSigns;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class EncounterDirectory {
    private HashMap<String, Encounter> directory;
    
    public EncounterDirectory(){
        this.directory = new HashMap<String, Encounter>();
        Encounter encounter = new Encounter();
        encounter.setPatientId("pat_1");
        encounter.setDoctorId("doc_1");
        encounter.setTimestamp(new Timestamp(System.currentTimeMillis()));
        encounter.setVitalSigns(new VitalSigns());
        addEncounter(encounter);
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
