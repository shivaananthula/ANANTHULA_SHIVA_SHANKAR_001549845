/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CourseSchedule.CourseLoad;
import EmploymentHistory.Employment;
import EmploymentHistory.EmploymentHistroy;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
        this.transcript.setStudentProfile(this);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistroy employmenthistory) {
        this.employmenthistory = employmenthistory;
    }
    
    public Transcript AddTranscript(){
        transcript = new Transcript();
        transcript.setStudentProfile(this);
        return transcript;
    }

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        transcript.setStudentProfile(this);
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
    public void AddEmployment(Employment e){
        e.setStudentProfile(this);
        this.employmenthistory.AddEmployment(e);
    }
    
    public int GetNumberOfPromotions(){
        
        int count=0;
        for(Employment e: this.employmenthistory.getEmployments()){
            count+=e.getPromotions();
        }
        return count;
    }
}
