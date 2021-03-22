/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import Persona.StudentProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shiva
 */
public class CollegeDirectory {
    
    public ArrayList<College> Colleges;

    public ArrayList<College> getColleges() {
        return Colleges;
    }

    public void setColleges(ArrayList<College> Colleges) {
        this.Colleges = Colleges;
    }
    
    
    //Ranking Collges based on the number of Promotions students are getting over the past 5 years.
    public HashMap<College,Integer> RankCollegesBasedOnPromotions(){
        
        HashMap<College,Integer> CollegeToPromotions = new HashMap<College,Integer>();
        for(College college: this.Colleges){
            int NumberOfPromotions = 0;
            for(Department department: college.departments){
                NumberOfPromotions+= department.TotalPromotions();
            }
            CollegeToPromotions.put(college, NumberOfPromotions);
        }
        
        List<Map.Entry<College,Integer>> list = 
                new LinkedList<Map.Entry<College,Integer>>(CollegeToPromotions.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<College, Integer> >() { 
            public int compare(Map.Entry<College, Integer> o1,  
                               Map.Entry<College, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        
        HashMap<College, Integer> temp = new LinkedHashMap<College, Integer>(); 
        for (Map.Entry<College, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        return temp;
    }
    
    
    //Rank the colleges depending on the Average CGPA per student.
    public HashMap<College,Double> RankCollegesbasedOnGPA(){
        HashMap<College,Double> CollegeToPromotions = new HashMap<College,Double>();
        
         for(College college: this.Colleges){
            double AggregateGPA =0.0;
            int counter=0;
            for(Department department: college.departments){
                for(StudentProfile s: department.getStudentDirectory().GetStudents()){
                    AggregateGPA += s.getTranscript().CalculateGPA();
                    counter++;
                }
            }
            CollegeToPromotions.put(college, AggregateGPA/counter);
        }
         
         List<Map.Entry<College,Double>> list = 
                new LinkedList<Map.Entry<College,Double>>(CollegeToPromotions.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<College, Double> >() { 
            public int compare(Map.Entry<College, Double> o1,  
                               Map.Entry<College, Double> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        
        HashMap<College, Double> temp = new LinkedHashMap<College, Double>(); 
        for (Map.Entry<College, Double> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        return temp;
    }
    
    
     
}
