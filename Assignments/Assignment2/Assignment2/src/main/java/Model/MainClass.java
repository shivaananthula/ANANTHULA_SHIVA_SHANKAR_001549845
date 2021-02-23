/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shiva
 */
public class MainClass {
    
    public static void main(String args[]){
        
        PatientDirectory patientDirectory = new PatientDirectory();
        System.out.println("");
        
        int choice;
        do{
            System.out.println("-----------------------------------");
            System.out.println("Welcome to Boston Childrens Hospital");
            System.out.println("--------------------------------------");
            System.out.println("Please follow the menu below for the actions to be performed");
            System.out.println("1: Create a new Patient Details\n 2: View Patient Details\n 3: Check for the Normality of a patient\n 4: Check for Vital Specific Normality\n 5: Exit");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("You have chosen to enter the details of the patient.");
                    System.out.println("Please enter the patientID:");
                    int patientID = s.nextInt();
                    
                    Patient retrievedPatient = patientDirectory.getPatient(patientID);
                    Patient incomingPatient;
                    if(retrievedPatient == null){
                        System.out.println("Please enter the patient name:");
                        String name = s.next();
                        System.out.println("Please enter the patient age according to following rules. ");
                        System.out.println("1. 'NewBorn'  2. 'Infant'  3. 'Toddler'  4. 'Preschoolar' 5.'SchoolAge' 6.'Adoloscent' ");
                        String age = s.next();

                        incomingPatient = new Patient();
                        incomingPatient.setAge(age);
                        incomingPatient.setName(name);
                        incomingPatient.setPatientID(patientID);
                        patientDirectory.Patients.add(incomingPatient);
                    }
                    else{
                        incomingPatient = retrievedPatient;
                        System.out.println("Hello "+ incomingPatient.getName());
                    }
                    
                    System.out.println("Please enter the patient Vitals for the following things:");
                    System.out.println("Please enter the respiratory rate:");
                    int respiratoryRate = s.nextInt();
                    System.out.println("Please enter the heart rate:");
                    int heartRate = s.nextInt();
                    System.out.println("Please enter the blood Pressure:");
                    int bloodPressure = s.nextInt();
                    System.out.println("Please enter the weight");
                    int weight = s.nextInt();
                    System.out.println("Please enter the date:");
                    String time = s.next();
                    
                    VitalSigns vitals = new VitalSigns();
                    vitals.setBloodPressure(bloodPressure);
                    vitals.setHeartRate(heartRate);
                    vitals.setRespiratoryRate(respiratoryRate);
                    vitals.setWeight(weight);
                    vitals.setTimeOfSamples(time);
                    incomingPatient.AddPatientVitals(vitals);
                    if(incomingPatient.CheckIfPatientNormal()){
                        System.out.println("The Patient is normal.");
                    }
                    else{
                        System.out.println("The Patient is not normal.");
                    }
                    break;
                    
                case 2:
                    System.out.println("The patient details are as follows:");
                    for(Patient p : patientDirectory.Patients){
                        System.out.println("Name:"+ p.getName());
                        System.out.println("Age:"+p.getAge());
                        System.out.println("The previous vitals of this patient are as follows:");
                        for(VitalSigns v: p.getPatientVitals()){
                            System.out.println( "Time:\t"+ v.getTimeOfSamples() + "\nHeartBeatRate:\t"+ v.getHeartRate() + "\nRespiratoryRate:\t" + v.getRespiratoryRate()
                            + "\nBloodPressure:\t" + v.getBloodPressure() + "\nWeight:\t" + v.getWeight());
                        }
                        System.out.println("The current vitals of the patient are as follows:");
                        System.out.println("Time:\t" + p.getCurrentVital().getTimeOfSamples() + "\nHeartBeatRate:\t"+ p.getCurrentVital().getHeartRate() + "\nRespiratoryRate:\t" + p.getCurrentVital().getRespiratoryRate()
                            + "\nBloodPressure:\t" + p.getCurrentVital().getBloodPressure() + "\nWeight:\t" + p.getCurrentVital().getWeight());
                    }
                    break;
                
                case 3:
                    System.out.println("Please enter the Id of the Patient to whom you want to check the normality:");
                    int id = s.nextInt();
                    
                    Patient p = patientDirectory.getPatient(id);
                    if(p == null){
                        System.out.println("There is no patient with the given id.");
                    }
                    else{
                        if(p.CheckIfPatientNormal()){
                            System.out.println("The patient health is normal according to the current vitals.");
                        }
                        else{
                            System.out.println("The patient health is not normal according to the current vitals.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter the Id of patient to whom you want to check vitals specific normality.");
                    int patientId = s.nextInt();
                    System.out.println("Please enther the input for the vital that needs to be checked.");
                    String input = s.next();
                    
                    Patient pa = patientDirectory.getPatient(patientId);
                    boolean IsNormal = pa.CheckVitalSpecificNormality(input);
                    if(IsNormal){
                        System.out.println("The patient's " + input + "is normal");
                    }
                    else{
                        System.out.println("The patient's " + input + "is not normal");

                    }
                    break;
                default:
                    break;
                    
                    
            }
            
        }while(choice<5);
    }
    
    
}
