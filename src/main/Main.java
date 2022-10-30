/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.directories.CityDirectory;
import model.directories.CommunityDirectory;
import model.directories.DoctorDirectory;
import model.directories.HospitalDirectory;
import model.directories.HouseDirectory;
import model.directories.PatientDirectory;
import model.directories.PersonDirectory;
import model.directories.VitalSignsDirectory;
import ui.Login;

/**
 *
 * @author jaymithani
 */
public class Main {
    
    public static PersonDirectory pDirectory = new PersonDirectory();
    public static CityDirectory cityDirectory = new CityDirectory();
    public static CommunityDirectory comDircetDirectory = new CommunityDirectory();
    public static HospitalDirectory hosDirectory = new HospitalDirectory();
    public static DoctorDirectory doctorDirectory = new DoctorDirectory();
    public static PatientDirectory patDirectory = new PatientDirectory();
    public static VitalSignsDirectory vitalDirceDirectory = new VitalSignsDirectory();
    public static HouseDirectory houseDirectory = new HouseDirectory();
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
