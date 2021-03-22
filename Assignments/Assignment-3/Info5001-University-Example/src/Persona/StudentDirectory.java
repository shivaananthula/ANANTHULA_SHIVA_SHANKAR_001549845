/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Department.Department;
import EmploymentHistory.Employment;
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
 * @author kal bugrara
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }
    
    public void AddStudents(StudentProfile[] students){
        for(StudentProfile sp: students){
            studentlist.add(sp);
        }
    }
    
    public ArrayList<StudentProfile> GetStudents(){
        return this.studentlist;
    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    
    //The below method traverses through all the Student profiles and sorts the students based on the number of promotions they are getting.
    public HashMap<StudentProfile,Integer> RankStudentsBasedOnPromotions(){
        
        HashMap<StudentProfile,Integer> StudentToPromotions = new HashMap<StudentProfile, Integer>();
        
        for(StudentProfile sp: this.studentlist){
            int count=0;
            for(Employment emp : sp.employmenthistory.getEmployments()){
                count+= emp.getPromotions();
            }
            StudentToPromotions.put(sp, count);
        }
        
        List<Map.Entry<StudentProfile,Integer>> list = 
                new LinkedList<Map.Entry<StudentProfile,Integer>>(StudentToPromotions.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<StudentProfile, Integer> >() { 
            public int compare(Map.Entry<StudentProfile, Integer> o1,  
                               Map.Entry<StudentProfile, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        
        HashMap<StudentProfile, Integer> temp = new LinkedHashMap<StudentProfile, Integer>(); 
        for (Map.Entry<StudentProfile, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        return temp;
        
    }
    
}
