/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }
    
    public double getFacultyFeedback(){
        this.courseoffer.computeFacultyFeedback();
        return this.courseoffer.FacultyReviewAggregate;
    }
    
    //Each faculty calls this method for grading a particular seat. This method just extracts the courseoffer 
    //and calls the SetGradeforSeatNumber in courseoffer.
    public void setGradeForParticularSeat(int seatNumber,double grade){
        this.courseoffer.setGradeforSeatNumber(seatNumber, grade);
    }
}
