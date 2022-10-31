/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import java.sql.Timestamp;
import java.util.HashMap;
import model.entities.City;
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
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(0);
        vs.setHeartRate(0);
        encounter.setVitalSigns(vs);
        addEncounter(encounter);
    }

    public void addEncounter(Encounter e){
        e.setId(Utility.getInstance().getNextEncounterId());
        this.directory.put(e.getId(), e);
    }

    public void updateEncounter(Encounter en){
        directory.replace(en.getId(),en);
    }
    
    public HashMap<String, Encounter> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Encounter> directory) {
        this.directory = directory;
    }
    
    public void deleteEncounter(String c){
        this.directory.remove(c);  
    }
    
    @Override
    public String toString() {
        return "EncounterDirectory{" + "directory=" + directory + '}';
    }
    
}
