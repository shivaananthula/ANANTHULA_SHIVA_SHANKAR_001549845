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
public class Patient extends Person {
    
    public EncounterHistory EncounterHistory;
    
    public Encounter CurrentEncounter;
    
    public Patient(Person p){
        this.Name = p.getName();
        this.Age = p.getAge();
        this.PatientID = p.getPatientID();
        this.EncounterHistory = new EncounterHistory();
    }
    
    public void AddEncounter(Encounter enc){
        if(this.CurrentEncounter == null){
           this.CurrentEncounter = enc; 
        }
        else{
            this.EncounterHistory.AddEncounter(this.CurrentEncounter);
            this.CurrentEncounter = enc;
        }
    }

    public EncounterHistory getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(EncounterHistory EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public Encounter getCurrentEncounter() {
        return CurrentEncounter;
    }

    public void setCurrentEncounter(Encounter CurrentEncounter) {
        this.CurrentEncounter = CurrentEncounter;
    }

    public boolean CheckVitalSpecificNormality(String input){
        
        boolean IsNormal = false;
        VitalSigns vitals = this.CurrentEncounter.getVitalsSigns();
        switch(this.Age){
            case "NewBorn" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getBloodPressure(), 50, 70);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 120 , 160);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 30, 50);
                }
                else if(input.equals("Weight")){
                    IsNormal = this.InRange(vitals.getWeight(), 2, 3);
                }
                break;
            case "Infant" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getBloodPressure(), 70, 100);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 80 , 140);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 20, 30);
                }
                else if(input.equals("Weight")){
                    IsNormal = this.InRange(vitals.getWeight(), 4, 10);
                }
                break;
            case "Toddler" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getBloodPressure(), 80, 110);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 80 , 130);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 20, 30);
                }
                else if(input.equals("Weight")){
                    IsNormal = this.InRange(vitals.getWeight(), 10, 14);
                }
                break;
            case "Preschooler" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getBloodPressure(), 80, 110);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 80 , 120);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 20, 30);
                }
                else if(input.equals("Weight")){
                    IsNormal = this.InRange(vitals.getWeight(), 14, 18);
                }
                break;
            case "SchoolAge" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 80, 120);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 70 , 110);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 20, 30);
                }
                else if(input.equals("Weight")){
                    IsNormal = this.InRange(vitals.getWeight(), 20, 42);
                }
                break;
            case "Adolescent" :
                if(input.equals("BloodPressure")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 110, 120);
                }
                else if(input.equals("HeartRate")){
                    IsNormal = this.InRange(vitals.getHeartRate(), 55 , 105);
                }
                else if(input.equals("RespiratoryRate")){
                    IsNormal = this.InRange(vitals.getRespiratoryRate(), 10, 20);
                }
                else if(input.equals("Weight")){
                    IsNormal = vitals.getWeight()>50;
                }
                break;
            
                
        }
        return IsNormal;
    }
    
    
    public boolean CheckIfPatientNormal(){
        
        VitalSigns vitals = this.CurrentEncounter.getVitalsSigns();
        boolean IsNormal = false;
        switch(this.Age){
            case "Newborn": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),30,50) && 
                        this.InRange(vitals.getHeartRate(),120,160) &&
                        this.InRange(vitals.getBloodPressure(),50,70) &&
                        this.InRange(vitals.getWeight(),2,3);
                break;
            case "Infant": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),20,30) && 
                        this.InRange(vitals.getHeartRate(),80,140) &&
                        this.InRange(vitals.getBloodPressure(),70,100) &&
                        this.InRange(vitals.getWeight(),4,10);
                break;
                
            case "Toddler": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),20,30) && 
                        this.InRange(vitals.getHeartRate(),80,130) &&
                        this.InRange(vitals.getBloodPressure(),80,110) &&
                        this.InRange(vitals.getWeight(),10,14);
                break;
            case "Preschooler": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),20,30) && 
                        this.InRange(vitals.getHeartRate(),80,120) &&
                        this.InRange(vitals.getBloodPressure(),80,110) &&
                        this.InRange(vitals.getWeight(),14,18);
                break;
            case "SchoolAge": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),20,30) && 
                        this.InRange(vitals.getHeartRate(),70,110) &&
                        this.InRange(vitals.getBloodPressure(),80,120) &&
                        this.InRange(vitals.getWeight(),20,42);
                break;
            case "Adolescent": 
                IsNormal = this.InRange(vitals.getRespiratoryRate(),12,20) && 
                        this.InRange(vitals.getHeartRate(),55,105) &&
                        this.InRange(vitals.getBloodPressure(),110,120) &&
                        vitals.getWeight()>50;
                break;
            default:
                IsNormal = false;
                break;
        }
        return IsNormal;
    }
    
    public boolean InRange(int tocompare,double val1,double val2){
        
        return !(tocompare < val1 || tocompare > val2);
    }
    
    
}
    
    

