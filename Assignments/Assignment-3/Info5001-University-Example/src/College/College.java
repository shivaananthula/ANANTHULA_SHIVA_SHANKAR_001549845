/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import EmploymentHistory.Employment;
import Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class College {
    ArrayList<Department> departments;
    String name;
    
    public College(String name){
        this.name = name;
    }
    
    public Department newDepartment(String name){
        Department d = new Department(name);
        d.setCollege(this);
        this.departments.add(d);
        return d;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public double GetQualityOfCollege(){
        double AggregateQuality =0.0;
        int counter =0;
        for(Department dep: this.departments){
                for(StudentProfile s: dep.getStudentDirectory().GetStudents()){
                    for(Employment emp: s.getEmploymenthistory().getEmployments()){
                        AggregateQuality += emp.ComputeQuality();
                        counter++;
                    }
                }
            }
        return AggregateQuality/counter;
    }
    
    
    
}
