/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Persona.Person;
import CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile {

    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public void AddFacultyAssignment(FacultyAssignment fa){
        this.facultyassignments.add(fa);
    }
    
    public FacultyAssignment getCourseOffer(String courseid){
        for(FacultyAssignment fa: this.facultyassignments){
            if(fa.courseoffer.getCourseNumber().equals(courseid)){
                return fa;
            }
        }
        return null;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public double getFacultyReviewAcrossCourses(){
        double aggregate=0.0;
        int counter =0;
        for(FacultyAssignment fa: this.facultyassignments){
            aggregate += fa.getFacultyFeedback();
            counter++;
        }
        return aggregate/counter;
    }

    
    
}
