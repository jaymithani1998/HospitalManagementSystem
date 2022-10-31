/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import main.Main;
import model.entities.City;
import model.entities.Person;
import util.Utility;

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
        person.setPassword("admin");
        person.setName("Jay");
        person.setRole("System Admin");
        addPerson(person);
       
        Person person1 = new Person();
        person1.setUserName("cadmin");
        person1.setPassword("cadmin");
        person1.setName("cadmin");
        person1.setRole("Community Admin");
        addPerson(person1);
        
    }
    
    public boolean addPerson(Person p){
        for(String id: this.directory.keySet()){
            Person per = this.directory.get(id);
            if(per.getUserName().equals(p.getUserName())){
//                System.out.println("Credntials Directory:"+this.directory);
                JOptionPane.showMessageDialog(null, "Username already exists" + per.getUserName());
                return false;
            }
        }
        if (p.getId() == null){
            p.setId(Utility.getInstance().getNextPersonId());
        }
        this.directory.put(p.getId(), p);
//        System.out.println("City Dircetory"+this.directory);
        return true;
    }
    
    public void updatePerson(Person person){
        directory.replace(person.getId(), person);
    }
    
    public String[] getAdminsForCommunitiesAdminComboBox(){
        ArrayList<String> returnResult = new ArrayList<>();
        for(String id: this.directory.keySet()){
            Person p = this.directory.get(id);
            if(p.getRole().equals("Community Admin")){
                returnResult.add(p.getName()+ ":" + p.getId());
            }
        }
        return returnResult.toArray(new String[0]);
    }
    
    public boolean validateCredentials(String uname, String password){
//        System.out.println("Password" + password);
//        System.out.println("Credentials" + this.directory);
        for(String id: this.directory.keySet()){
            Person per = this.directory.get(id);
            if(per.getUserName().equals(uname) && per.getPassword().equals(password)){
                Main.currentUser = per;
                return true;
            }
        }
        return false;
    }

    public HashMap<String, Person> getDirectory() {
        return directory;
    }

    public void setDirectory(HashMap<String, Person> directory) {
        this.directory = directory;
    }
    
     
    public void deletePerson(String c){
        this.directory.remove(c);
    }
    
    @Override
    public String toString() {
        return "PersonDirectory{" + "directory=" + directory + '}';
    }
            
}
