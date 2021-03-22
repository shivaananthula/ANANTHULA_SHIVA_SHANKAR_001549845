/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.Seat;
import EmploymentHistory.Employment;
import Faculty.FacultyDirectory;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
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
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    //EmployerDirectory employerdirectory;

    HashMap<String, CourseSchedule> mastercoursecatalog;
    
    College College;

    public College getCollege() {
        return College;
    }

    public void setCollege(College College) {
        this.College = College;
    }

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory(this);
    }

    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
        
        return studentdirectory;
        
    }
    
    public FacultyDirectory getFacultyDirectory(){
        return facultydirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    //Gets course order of the promotions in the department that produced more promotions
    
    public HashMap<Course, Integer> getMostPopularCourse(){
        
        HashMap<Course,Integer> CourseToPromotions = new HashMap<Course, Integer>();
        for(Map.Entry entry: this.mastercoursecatalog.entrySet()){
            CourseSchedule cs = (CourseSchedule)entry.getValue();
            for(CourseOffer co: cs.getSchedule()){
                int promotions =0;
                for(Seat s: co.getSeatlist()){
                    if(s.getSeatassignment()!=null){
                        promotions += s.getSeatassignment().getCourseload().getTranscript().getStudentProfile().GetNumberOfPromotions();

                    }
                }
                CourseToPromotions.put(co.getCourse(), promotions);
            }
        }
      
        
        List<Map.Entry<Course,Integer>> sortedCourseList = 
                new LinkedList<Map.Entry<Course,Integer>>(CourseToPromotions.entrySet());
        
        Collections.sort(sortedCourseList, new Comparator<Map.Entry<Course, Integer> >() { 
            public int compare(Map.Entry<Course, Integer> o1,  
                               Map.Entry<Course, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        
        HashMap<Course, Integer> temp = new LinkedHashMap<Course, Integer>(); 
        for (Map.Entry<Course, Integer> aa : sortedCourseList) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        return temp;
    }
    
    public int TotalPromotions(){
        
        int Counter =0;
        for(StudentProfile s: this.studentdirectory.GetStudents()){
            Counter+= s.GetNumberOfPromotions();
        }
        return Counter;
    }
    
    public double DepartmentQuality(){
        double AggregateQuality =0.0;
        int counter =0;
        for(StudentProfile s: this.getStudentDirectory().GetStudents()){
                    for(Employment emp: s.getEmploymenthistory().getEmployments()){
                        AggregateQuality += emp.ComputeQuality();
                        counter++;
                    }
                }
        return AggregateQuality/counter;
                
    }
}
