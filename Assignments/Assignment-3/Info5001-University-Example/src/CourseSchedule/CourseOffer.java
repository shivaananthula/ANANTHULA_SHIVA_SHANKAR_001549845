/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import Faculty.FacultyAssignment;
import Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    
    public double FacultyReviewAggregate;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
        fp.AddFacultyAssignment(facultyassignment);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }
    
    public void computeFacultyFeedback(){
    
        //The cumulative aggregate for all the students
        double aggregateReview = 0.0;
        //The counter to find the number of students gave review
        int counterForStudents =0;
        for(Seat s : this.seatlist){
            if(s.isOccupied()){
                //For each seat in courseoffer, if a seat is occupied and if the seat assignemnt 
                //of this seat has a review posted, then we can add this review to the cumulative review.
                if(s.seatassignment.StudentReviewForFaculty != 0.0){
                    aggregateReview += s.seatassignment.StudentReviewForFaculty;
                    counterForStudents++;
                }
            }
        }
        this.FacultyReviewAggregate = aggregateReview/counterForStudents;
    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    
    //The following method would be called by the Faculty on the FacultyAssignment for each course he has taught and
    // for that respective course, he selects the seatnumber to which he has graded and sets the value by calling thuis function.
    
    public void setGradeforSeatNumber(int seatNumber, double grade){
        Seat seat = null;
        for(Seat s: this.seatlist){
            if(s.number==seatNumber){
                seat=s;
                break;
            }
        }
        seat.setGrade(grade);
        
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyAssignment getFacultyassignment() {
        return facultyassignment;
    }

    public void setFacultyassignment(FacultyAssignment facultyassignment) {
        this.facultyassignment = facultyassignment;
    }

    public double getFacultyReviewAggregate() {
        return FacultyReviewAggregate;
    }

    public void setFacultyReviewAggregate(double FacultyReviewAggregate) {
        this.FacultyReviewAggregate = FacultyReviewAggregate;
    }

}
