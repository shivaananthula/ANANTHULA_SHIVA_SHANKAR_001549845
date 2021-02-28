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
public class PersonDirectory {
    
    public ArrayList<Person> Persons;

    public PersonDirectory() {
        this.Persons = new ArrayList<Person>();
    }
    
    public void AddPerson(Person person){
        this.Persons.add(person);
    }
    
    public Person getPerson(int id){
        Person person = null;
        for(Person p: this.Persons){
            if(p.getPatientID() == id){
                person = p;
            }
        }
        return person;
    }
    
    
}
