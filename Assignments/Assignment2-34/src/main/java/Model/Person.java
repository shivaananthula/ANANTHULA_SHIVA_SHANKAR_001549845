/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shiva
 */
public class Person {
    
    public int PatientID;
    
    public String Name;
    
    public String Age;
    
//    public Person(int Pid, String name, String age){
//        this.Age = age;
//        this.Name = name;
//        this.PatientID = Pid;
//    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
}
