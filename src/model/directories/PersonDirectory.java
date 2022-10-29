/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;
import java.util.HashMap;
import model.entities.Person;

/**
 *
 * @author jaymithani
 */
public class PersonDirectory {
    
    private HashMap<String,Person> directory;
    
    public PersonDirectory(){
        this.directory = new HashMap<String,Person>();
    }

    @Override
    public String toString() {
        return "PersonDirectory{" + "directory=" + directory + '}';
    }
            
}
