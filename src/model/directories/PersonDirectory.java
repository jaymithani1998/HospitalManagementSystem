/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.entities.Person;

/**
 *
 * @author jaymithani
 */
public class PersonDirectory {
    
    private HashMap<String,Person> directory;
    
    public PersonDirectory(){
        this.directory = new HashMap<String,Person>();
        Person person = new Person();
        person.setUserName("admin");
        person.setId("adm101");
        person.setPassword("admin");
        person.setName("Jay");
        addPerson(person);
    }
    
    public void addPerson(Person p){
        for(String id: this.directory.keySet()){
            Person per = this.directory.get(id);
            if(per.getUserName().equals(p.getUserName())){
                JOptionPane.showMessageDialog(null, "Username already exists" + per.getUserName());
                return;
            }
        }
        this.directory.put(p.getId(), p);
    }

    public boolean validateCredentials(String uname, String password){
        for(String id: this.directory.keySet()){
            Person per = this.directory.get(id);
            if(per.getUserName().equals(uname) && per.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public String toString() {
        return "PersonDirectory{" + "directory=" + directory + '}';
    }
            
}
