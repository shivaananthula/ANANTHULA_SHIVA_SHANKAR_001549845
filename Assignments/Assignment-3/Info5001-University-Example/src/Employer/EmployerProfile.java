/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employer;

import EmploymentHistory.Employment;
import java.util.ArrayList;

/**
 *
 * @author shiva
 * Employer here is nothing but a company which us providing jobs to individuals
 */
public class EmployerProfile {
    String name;
    ArrayList<Employment> employments;
    public EmployerProfile(String n){  //could be company instead of just a name as a string
        name = n;
        employments = new ArrayList<Employment>();
    }
         public boolean isMatch(String id){
        if(name.equals(id)) return true;             //String is an object and can do equal matach
        return false;
    }
         
     public Employment AddEmployment(String jobRole){
         Employment e =  new Employment(jobRole);
         this.employments.add(e);
         return e;
     }
    
}
