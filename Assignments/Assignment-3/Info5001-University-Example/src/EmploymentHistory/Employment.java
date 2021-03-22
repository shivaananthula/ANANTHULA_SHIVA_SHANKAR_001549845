/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploymentHistory;

import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Employer.EmployerProfile;
import Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    public ArrayList<CourseOffer> relevantcourseoffers;
    int promotions;
    String Role;
    Employment nextemplyment;  //next job so they are in a sequence 
    
    EmployerProfile employer;
    
    StudentProfile studentProfile;
    public Employment(String RoleName){
        
        relevantcourseoffers = new ArrayList<CourseOffer>();
        this.Role = RoleName;
        this.promotions = 0;
    }
    
    public void AddPromotion(){
        this.promotions ++;
    }

    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public int getPromotions() {
        return promotions;
    }

    public void setPromotions(int promotions) {
        this.promotions = promotions;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public Employment getNextemplyment() {
        return nextemplyment;
    }

    public void setNextemplyment(Employment nextemplyment) {
        this.nextemplyment = nextemplyment;
    }

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
    
    //The below method computes the quality for the student based on the relevant courses required for the job and the courses he has taken
    public double ComputeQuality(){
        int totalrelavantCourses = this.relevantcourseoffers.size();
        
        ArrayList<CourseOffer> StudentcourseOffers = new ArrayList<CourseOffer>();
        
        for(CourseLoad cl : this.studentProfile.getTranscript().getCourseloadlist().values() ){
           for(SeatAssignment sa: cl.getSeatassignments()){
               StudentcourseOffers.add(sa.getSeat().getCourseoffer());
           } 
        }
        
        int counter =0;
        for(CourseOffer relco: this.relevantcourseoffers){
            for(CourseOffer stuco: StudentcourseOffers){
                if(relco.equals(stuco)){
                    counter++;
                }
            }
        }
        
        double quality = counter/totalrelavantCourses;
        return quality;
    }
    
    

}
