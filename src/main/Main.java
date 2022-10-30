/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.directories.PersonDirectory;
import ui.Login;

/**
 *
 * @author jaymithani
 */
public class Main {
    
    public static PersonDirectory pDirectory = new PersonDirectory();
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
