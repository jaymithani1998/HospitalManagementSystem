/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author jaymithani
 */
public class VitalSigns {
    //bp heartrate
    
    private int bloodPressure = 0;
    private int heartRate = 0;

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "bloodPressure=" + bloodPressure + ", heartRate=" + heartRate + '}';
    }
    
    
}
