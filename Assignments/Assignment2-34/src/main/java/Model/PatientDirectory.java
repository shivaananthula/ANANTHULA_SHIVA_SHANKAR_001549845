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
public class PatientDirectory {
    
    public ArrayList<Patient> Patients;
    
    public PatientDirectory(){
        this.Patients = new ArrayList<Patient>();
    }
    
    public void AddPatient(Patient p){
        this.Patients.add(p);
    }
    
    public Patient getPatient(int id){
        Patient patient = null;
        for(Patient p: this.Patients){
            if(p.getPatientID() == id){
                patient = p;
            }
        }
        return patient;
    }
}
