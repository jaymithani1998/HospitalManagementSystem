/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author jaymithani
 */
public class Utility {
    
    public static int DOCTOR_ID = 1;
    public static int PATIENT_ID = 1;
    public static int CITY_ID = 1;
    public static int COMMUNITY_ID = 1;
    public static int HOSPITAL_ID = 1;
    public static int HOUSE_ID = 1;
    public static int ENCOUNTER_ID = 1;
    public static int VITAL_ID = 1;
    
    public static Utility instance = new Utility();
    
    private Utility(){
        
    }
    
    public static Utility getInstance(){
        return instance;
    }
    
    public String getNextDoctorId(){
        String id = ""+DOCTOR_ID;
        DOCTOR_ID += 1;
        return "doc_"+id;
    }
    
    public String getNextPatientId(){
        String id = ""+PATIENT_ID;
        PATIENT_ID += 1;
        return "pat_"+id;
    }
    
    public String getNextHospitalId(){
        String id = ""+HOSPITAL_ID;
        HOSPITAL_ID += 1;
        return "hosp_"+id;
    }
    
    public String getNextCityId(){
        String id = ""+CITY_ID;
        CITY_ID += 1;
        return "city_"+id;
    }
    
    public String getNextCommunityId(){
        String id = ""+COMMUNITY_ID;
        COMMUNITY_ID += 1;
        return "com_"+id;
    }
    
    public String getNextHouseId(){
        String id = ""+HOUSE_ID;
        HOUSE_ID += 1;
        return "home_"+id;
    }
    
    public String getNextEncounterId(){
        String id = ""+ENCOUNTER_ID;
        ENCOUNTER_ID += 1;
        return "enc_"+id;
    }
    
    public String getNextVitalSignId(){
        String id = ""+VITAL_ID;
        VITAL_ID += 1;
        return "vs_"+id;
    }
    
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int d = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
}
