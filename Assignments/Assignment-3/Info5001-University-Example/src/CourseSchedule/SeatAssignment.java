/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

/**
 *
 * @author shiva
 */
public class SeatAssignment {
    
    Seat seat;
    CourseLoad courseload;
    public double Grade;
    
    public double StudentReviewForFaculty;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public CourseLoad getCourseload() {
        return courseload;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }

    public double getStudentReviewForFaculty() {
        return StudentReviewForFaculty;
    }

    public void setStudentReviewForFaculty(double StudentReviewForFaculty) {
        this.StudentReviewForFaculty = StudentReviewForFaculty;
    }
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public void setGrade(double value){
        this.Grade = value;
    }
    
}
