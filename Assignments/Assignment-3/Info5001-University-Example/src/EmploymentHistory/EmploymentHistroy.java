/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploymentHistory;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(String job){
        Employment ne = new Employment(job);
        employments.add(ne);
        return ne;
    }
    
    
    //While adding a new emoloyment, we get the last employment and add the current emplyment as the next employment to it.
    //and add it to the arraylist.
    public void AddEmployment(Employment e){
        if(employments.size() == 0){
            this.employments.add(e);
        }
        else{
            Employment prevEmployment = this.employments.get(this.employments.size()-1);
            prevEmployment.nextemplyment = e;
        }
        
        this.employments.add(e);
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }
    
}
