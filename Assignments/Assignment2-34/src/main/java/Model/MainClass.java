/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author shiva
 */
public class MainClass {
    
    public static void main(String args[]){
        
        PersonDirectory personDirectory = new PersonDirectory();
        PatientDirectory patientDirectory = new PatientDirectory();
        
        ArrayList<House> houseDirectory = new ArrayList<House>();
        
        Person p1 =  new Person();
        p1.setName("Shiva");
        p1.setAge("NewBorn");
        p1.setPatientID(1);
        
        personDirectory.AddPerson(p1);
        
        Patient pat1 = new Patient(p1);
        Encounter enc1 = new Encounter();
        enc1.setTimeStamp(new Date());
        VitalSigns v1 = new VitalSigns();
        v1.setBloodPressure(10);
        v1.setHeartRate(10);
        v1.setRespiratoryRate(19);
        v1.setWeight(10);
        enc1.setVitalsSigns(v1);
        pat1.AddEncounter(enc1);
        
        patientDirectory.AddPatient(pat1);
        
        
        Person p2 =  new Person();
        p2.setName("Gowtham");
        p2.setAge("Infant");
        p2.setPatientID(2);
        
        personDirectory.AddPerson(p2);
        
        Patient pat2 = new Patient(p2);
        Encounter enc2 = new Encounter();
        enc2.setTimeStamp(new Date());
        VitalSigns v2 = new VitalSigns();
        v2.setBloodPressure(10);
        v2.setHeartRate(10);
        v2.setRespiratoryRate(19);
        v2.setWeight(10);
        enc2.setVitalsSigns(v2);
        pat2.AddEncounter(enc2);
        
        patientDirectory.AddPatient(pat2);

        
        Person p3 =  new Person();
        p3.setName("Koushik");
        p3.setAge("Toddler");
        p3.setPatientID(3);
        
        personDirectory.AddPerson(p3);
        
        Patient pat3 = new Patient(p3);
        Encounter enc3 = new Encounter();
        enc3.setTimeStamp(new Date());
        VitalSigns v3 = new VitalSigns();
        v3.setBloodPressure(10);
        v3.setHeartRate(10);
        v3.setRespiratoryRate(19);
        v3.setWeight(10);
        enc3.setVitalsSigns(v3);
        pat3.AddEncounter(enc3);
        
        patientDirectory.AddPatient(pat3);

        
        Person p4 =  new Person();
        p4.setName("Karthik");
        p4.setAge("Preschooler");
        p4.setPatientID(4);
        
        personDirectory.AddPerson(p4);
        
        Patient pat4 = new Patient(p4);
        Encounter enc4 = new Encounter();
        enc4.setTimeStamp(new Date());
        VitalSigns v4 = new VitalSigns();
        v4.setBloodPressure(10);
        v4.setHeartRate(10);
        v4.setRespiratoryRate(19);
        v4.setWeight(10);
        enc4.setVitalsSigns(v4);
        pat4.AddEncounter(enc4);
        
        patientDirectory.AddPatient(pat4);

        
        Person p5 =  new Person();
        p5.setName("Deepika");
        p5.setAge("Adolescent");
        p5.setPatientID(5);
        
        personDirectory.AddPerson(p5);
        
        Patient pat5 = new Patient(p5);
        Encounter enc5 = new Encounter();
        enc5.setTimeStamp(new Date());
        VitalSigns v5 = new VitalSigns();
        v5.setBloodPressure(10);
        v5.setHeartRate(10);
        v5.setRespiratoryRate(19);
        v5.setWeight(10);
        enc5.setVitalsSigns(v5);
        pat5.AddEncounter(enc5);
        
        patientDirectory.AddPatient(pat5);

        
        Person p6 =  new Person();
        p6.setName("Vignesh");
        p6.setAge("SchoolAge");
        p6.setPatientID(6);
        
        personDirectory.AddPerson(p6);
        
        Patient pat6 = new Patient(p6);
        Encounter enc6 = new Encounter();
        enc6.setTimeStamp(new Date());
        VitalSigns v6 = new VitalSigns();
        v6.setBloodPressure(10);
        v6.setHeartRate(10);
        v6.setRespiratoryRate(19);
        v6.setWeight(10);
        enc6.setVitalsSigns(v6);
        pat6.AddEncounter(enc6);
        
        patientDirectory.AddPatient(pat6);

        
        Person p7 =  new Person();
        p7.setName("Durga");
        p7.setAge("Toddler");
        p7.setPatientID(7);
        
        personDirectory.AddPerson(p7);
        
        Patient pat7 = new Patient(p7);
        Encounter enc7 = new Encounter();
        enc7.setTimeStamp(new Date());
        VitalSigns v7 = new VitalSigns();
        v7.setBloodPressure(10);
        v7.setHeartRate(10);
        v7.setRespiratoryRate(19);
        v7.setWeight(10);
        enc7.setVitalsSigns(v7);
        pat7.AddEncounter(enc7);
        
        patientDirectory.AddPatient(pat7);
        
        Person p8 =  new Person();
        p8.setName("Rakshith");
        p8.setAge("Toddler");
        p8.setPatientID(8);
        
        personDirectory.AddPerson(p8);
        
        Patient pat8 = new Patient(p8);
        Encounter enc8 = new Encounter();
        enc8.setTimeStamp(new Date());
        VitalSigns v8 = new VitalSigns();
        v8.setBloodPressure(10);
        v8.setHeartRate(10);
        v8.setRespiratoryRate(19);
        v8.setWeight(10);
        enc8.setVitalsSigns(v8);
        pat8.AddEncounter(enc8);
        
        patientDirectory.AddPatient(pat8);
        
        Person p9 =  new Person();
        p9.setName("Sai");
        p9.setAge("Toddler");
        p9.setPatientID(9);
        
        personDirectory.AddPerson(p9);
        
        Person p10 =  new Person();
        p10.setName("Manoj");
        p10.setAge("Toddler");
        p10.setPatientID(10);
        
        personDirectory.AddPerson(p10);
        
        
        House house1 =  new House();
        house1.setName("Ananthula");
        
        houseDirectory.add(house1);
      

        
        House house2 = new House();
        house2.setName("Chudi");
        houseDirectory.add(house2);
        
        House house3 = new House();
        house3.setName("Ravi");
        houseDirectory.add(house3);
        
        house1.AddPersons(p1);
        house1.AddPersons(p2);
        house2.AddPersons(p3);
        house2.AddPersons(p4);
        house3.AddPersons(p5);
        house3.AddPersons(p6);
        
        
        Community community1 = new Community();
        community1.setName("Roxburry");
        community1.AddHouses(house1);
        community1.AddHouses(house2);
        community1.AddHouses(house3);
        
        House house4 = new House();
        house4.setName("Davids");
        houseDirectory.add(house4);
        
        House house5 = new House();
        house5.setName("Philips");
        houseDirectory.add(house5);
        
        house4.AddPersons(p7);
        house4.AddPersons(p8);
        
        house5.AddPersons(p9);
        house5.AddPersons(p10);
        
        Community community2 = new Community();
        community2.setName("Boylston");
        community2.AddHouses(house4);
        community2.AddHouses(house5);
        
        City boston = new City();
        boston.AddCommunities(community1);
        boston.AddCommunities(community2);
        
        
        System.out.println("");
        
        int choice=0;
        do{
            System.out.println("-----------------------------------");
            System.out.println("Welcome to Boston Childrens Hospital");
            System.out.println("--------------------------------------");
            System.out.println("Please follow the menu below for the actions to be performed");
            System.out.println("1: Create a new Person Details\n 2:Create a new Patient details\n "
                    + "3: View All the patient Details\n" + "4:Check for Normality\n"+
                    " 5: Check for Vital Specific Normality\n 6: Check the number of patients having abnormal BloodPressure in Boston\n");
            Scanner s = new Scanner(System.in);
            boolean flag=true;
            while(flag){
                try{
                    choice = Integer.parseInt(s.next());
                    flag=false;
                }
                catch(Exception e){
                    System.out.println("Please enter only integers.");
                    flag=true;
                }
            }
            
            switch(choice){
                case 1:
                    System.out.println("You have chosen to add the details of a person.");
                    System.out.println("Enter the id of the person:");
                    int personID = s.nextInt();
                    Person person = personDirectory.getPerson(personID);
                    if(person!=null){
                        System.out.println("There exists a person with same ID in our city. Please enter another person details.");
                        break;
                    }
                    Person p = new Person();
                    System.out.println("Enter the person name:");
                    String personName = s.next();
                    System.out.println("Please enter the patient age according to following rules. ");
                    System.out.println("1. 'NewBorn'  2. 'Infant'  3. 'Toddler'  4. 'Preschoolar' 5.'SchoolAge' 6.'Adoloscent' ");
                    String age = s.next();
                    
                    p.setPatientID(personID);
                    p.setAge(age);
                    p.setName(personName);
                    
                    System.out.println("Enter the House Name of the patient:");
                    String houseName = s.next();
                    House existingHouse = GetHouse(houseDirectory, houseName);
                    if(existingHouse== null){
                        System.out.println("You have entered the wrong house name and hence please enter the correct details.");
                        break;
                    }
                    existingHouse.AddPersons(p);
                    personDirectory.AddPerson(p);
                    break;
                    
                case 2: 
                    System.out.println("You have chosen to enter the details of the patient.");
                    System.out.println("Please enter the patientID:");
                    int patientID = s.nextInt();
                    
                    Patient retrievedPatient = patientDirectory.getPatient(patientID);
                    if(retrievedPatient == null){
                        Person retrievedPerson = personDirectory.getPerson(patientID);
                        if(retrievedPerson == null){
                            System.out.println("There is no person with the same ID in our person directory records. Please enter the proper id number.");
                            break;
                        }
                        retrievedPatient = new Patient(retrievedPerson);
                        
                    }
                    
                    Date currentTime = new Date();
                    Encounter encounter = new Encounter();
                    encounter.setTimeStamp(currentTime);
                    
                    System.out.println("Please enter the patient Vitals for the following things:");
                    System.out.println("Please enter the respiratory rate:");
                    int respiratoryRate = s.nextInt();
                    System.out.println("Please enter the heart rate:");
                    int heartRate = s.nextInt();
                    System.out.println("Please enter the blood Pressure:");
                    int bloodPressure = s.nextInt();
                    System.out.println("Please enter the weight");
                    int weight = s.nextInt();
                    
                    VitalSigns vitals = new VitalSigns();
                    vitals.setBloodPressure(bloodPressure);
                    vitals.setHeartRate(heartRate);
                    vitals.setRespiratoryRate(respiratoryRate);
                    vitals.setWeight(weight);
                    
                    encounter.setVitalsSigns(vitals);
                    retrievedPatient.AddEncounter(encounter);
                    
                    break;
                    
                case 3:
                    System.out.println("The patient details are as follows:");
                    for(Patient patient : patientDirectory.Patients){
                        System.out.println("Name:"+ patient.getName());
                        System.out.println("Age:"+patient.getAge());
                        System.out.println("The previous vitals of this patient are as follows:");
                        for(Encounter enco: patient.getEncounterHistory().EncounterHistory){
                            System.out.println( "Time:\t"+ enco.getTimeStamp() + "\nHeartBeatRate:\t"+ enco.getVitalsSigns().getHeartRate() + "\nRespiratoryRate:\t" + enco.getVitalsSigns().getRespiratoryRate()
                            + "\nBloodPressure:\t" + enco.getVitalsSigns().getBloodPressure() + "\nWeight:\t" + enco.getVitalsSigns().getWeight());
                        }
                        System.out.println("The current vitals of the patient are as follows:");
                        System.out.println("Time:\t" + patient.getCurrentEncounter().getTimeStamp() + "\nHeartBeatRate:\t"+ patient.getCurrentEncounter().getVitalsSigns().getHeartRate() + 
                                "\nRespiratoryRate:\t" + patient.getCurrentEncounter().getVitalsSigns().getRespiratoryRate()
                            + "\nBloodPressure:\t" + patient.getCurrentEncounter().getVitalsSigns().getBloodPressure() + "\nWeight:\t" + patient.getCurrentEncounter().getVitalsSigns().getWeight());
                    }
                    break;
                
                case 4:
                    System.out.println("Please enter the Id of the Patient to whom you want to check the normality:");
                    int id = s.nextInt();
                    
                    Patient patient = patientDirectory.getPatient(id);
                    if(patient == null){
                        System.out.println("There is no patient with the given id.");
                    }
                    else{
                        if(patient.CheckIfPatientNormal()){
                            System.out.println("The patient health is normal according to the current vitals.");
                        }
                        else{
                            System.out.println("The patient health is not normal according to the current vitals.");
                        }
                    }
                    break;
                case 5:
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
                case 6:
                    int communityCounter = 0;
                    int cityCounter = 0;
                    for(Community comm: boston.getCommunities()){
                        for(House house: comm.getHouses()){
                            for(Person per: house.getPersons()){
                                Patient pat = patientDirectory.getPatient(per.getPatientID());
                                if(pat!=null){
                                    if(!pat.CheckVitalSpecificNormality("BloodPressure")){
                                        communityCounter++;
                                        cityCounter++;
                                    }
                                }
                            }
                        }
                        System.out.println("The number of patients with Blood Pressure abnormality in "+ comm.getName() + " is " + communityCounter);
                        communityCounter =0;
                    }
                    System.out.println("The number of patients with Blood Pressure Normality in Boston are "+ cityCounter);
                    break;
                default:
                    break;
                    
                    
            }
            
        }while(choice<7);
    }
    
    public static House GetHouse(ArrayList<House> houseDirectory, String houseName){
        House house = null;
        for(House h: houseDirectory){
            if(h.getName().equals(houseName)){
                house = h;
            }
        }
        return house;
    }
}
