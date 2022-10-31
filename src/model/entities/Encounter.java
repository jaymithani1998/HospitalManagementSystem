/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.sql.Timestamp;

/**
 *
 * @author jaymithani
 */
public class Encounter {
    
    //id, did, patid, vitalsigns, timestamp
    private String id;
    private String doctorId;
    private String patientId;
    VitalSigns vitalSigns;
    private Timestamp timestamp;
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Encounter{" + "id=" + id + ", doctorId=" + doctorId + ", patientId=" + patientId + ", vitalSigns=" + vitalSigns + ", timestamp=" + timestamp + '}';
    }
    
    
    
}
