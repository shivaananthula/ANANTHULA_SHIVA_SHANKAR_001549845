/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CourseSchedule.CourseLoad;
import CourseSchedule.SeatAssignment;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    
    StudentProfile studentProfile;
    
    public Transcript(){
        this.courseloadlist = new HashMap<String,CourseLoad>();
    }

    public HashMap<String, CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }

    public void setCourseloadlist(HashMap<String, CourseLoad> courseloadlist) {
        this.courseloadlist = courseloadlist;
    }
    
    public CourseLoad AddCourseLoad(String s){
        CourseLoad cl = new CourseLoad(s);
        cl.setTranscript(this);
        return cl;
    }

    public CourseLoad getCurrentcourseload() {
        return currentcourseload;
    }

    public void setCurrentcourseload(CourseLoad currentcourseload) {
        this.currentcourseload = currentcourseload;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
    
    
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        currentcourseload.setTranscript(this);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
    public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
    
    
    //The faculty sets the grade for each student for a seatassignment. Hence to calculayte the GPA for a student, we
    //need to go through each seat assignement of the student and aggregate them and average it.
    public double CalculateGPA(){
        double aggregateGrade =0.0;
        int counter=0;
        for(CourseLoad cl: this.courseloadlist.values()){
            for(SeatAssignment sa: cl.getSeatassignments()){
                aggregateGrade += sa.Grade;
                counter++;
            }
        }
        return aggregateGrade/counter;
    }
}
