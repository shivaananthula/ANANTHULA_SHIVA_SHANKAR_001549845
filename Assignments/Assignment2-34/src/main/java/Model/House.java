/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class House {
    
    public String Name;
    
    public ArrayList<Person> Persons;
    
    public House() {
        this.Persons = new ArrayList<Person>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Person> getPersons() {
        return Persons;
    }

    public void setPersons(ArrayList<Person> Persons) {
        this.Persons = Persons;
    }
    
    public void AddPersons(Person p){
        this.Persons.add(p);
    }
    
    
    
}
