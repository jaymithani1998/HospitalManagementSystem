/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.regex.Pattern;

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
    public static int PERSON_ID=1;
    
    // Regex for validation
    public static String regexAlphabets="^(?i)[a-z\\s]+$";
    public static String regexNumeric="^[0-9]+$";
    public static String regexAlphaNumeric="^(?i)[a-z0-9]+$";
    
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

    public String getNextPersonId(){
        String id = ""+PERSON_ID;
        PERSON_ID += 1;
        return "per_"+id;
    }
    
    public static boolean isOnlyAlphabets(String str){
        if(Pattern.matches(regexAlphabets, str)){
            return true;
        }
        return false;
    }
    
    public static boolean isOnlyNumeric(String str){
        if(Pattern.matches(regexNumeric, str)){
            return true;
        }
        return false;
    }
    
    public static boolean isOnlyAlphaNumeric(String str){
        if(Pattern.matches(regexAlphaNumeric, str)){
            return true;
        }
        return false;
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
