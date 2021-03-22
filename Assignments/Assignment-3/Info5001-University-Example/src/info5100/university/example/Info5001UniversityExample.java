/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import CourseCatalog.Course;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Department.Department;
import Employer.EmployerDirectory;
import Employer.EmployerProfile;
import EmploymentHistory.Employment;
import Faculty.FacultyAssignment;
import Faculty.FacultyProfile;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Transcript;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Created a department.
        Department department = new Department("Information Systems");
        
        //Created a new Course.
        Course course = department.newCourse("app eng", "info 5100", 4);
        Course course2 = department.newCourse("web design", "info 6150", 4);
        
        //Creating a new course schedule for the above two courses in the semester Fall 2020.
        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
        
        //From the course schedule, create a new courseoffering.
        CourseOffer courseoffer1 = courseschedule.newCourseOffer("info 5100");
        CourseOffer courseOffer2 = courseschedule.newCourseOffer("info 6150");
        
        //Generating seats for 2 course offers
        courseoffer1.generatSeats(10);
        courseOffer2.generatSeats(15);
        
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        Person person4 = pd.newPerson("1354235");
        
        Person person2 = pd.newPerson("13553");
        Person person3 = pd.newPerson("12424");
        
        Faculty.FacultyDirectory fd = department.getFacultyDirectory();
        Faculty.FacultyProfile fp = fd.newFacultyProfile(person2);
        Faculty.FacultyProfile fp2 = fd.newFacultyProfile(person3);
        //Assgning faculties to course offers
        fp.AssignAsTeacher(courseoffer1);
        fp2.AssignAsTeacher(courseOffer2);
        
        //
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student1 = sd.newStudentProfile(person);
        CourseLoad courseload = student1.newCourseLoad("Fall2020"); 
        
        courseload.newSeatAssignment(courseoffer1); //register student in class
        courseload.newSeatAssignment(courseOffer2);
        
        StudentProfile student2 = sd.newStudentProfile(person4);
        CourseLoad courseLoad2 = student2.newCourseLoad("Fall2020");
        courseLoad2.newSeatAssignment(courseoffer1);
        
        //Faculty setting grades for their respective subject students
        FacultyAssignment fasn = fp.getCourseOffer("info 5100");
        fasn.setGradeForParticularSeat(0, 3.5);
        fasn.setGradeForParticularSeat(1, 4);
        
        
        FacultyAssignment fasn2 = fp2.getCourseOffer("info 6150");
        fasn2.setGradeForParticularSeat(0, 4);
        
        
        //Students are setting review for their respective faculties.
        ArrayList<SeatAssignment> seatAssignments = student1.getTranscript().getCourseLoadBySemester("Fall2020").getSeatassignments();
        for(SeatAssignment sa: seatAssignments){
            sa.setStudentReviewForFaculty(8);
        }
        
        ArrayList<SeatAssignment> seatAssignments2 = student2.getTranscript().getCourseLoadBySemester("Fall2020").getSeatassignments();
        for(SeatAssignment sa: seatAssignments2){
            sa.setStudentReviewForFaculty(9);
        }
        
        
        //Displaying GPA for the students for the students
        System.out.println("Student 1 GPA is "+ student1.getTranscript().CalculateGPA());
        System.out.println("Student 2 GPA is "+ student2.getTranscript().CalculateGPA());
        
        //Displaying the Faculty review feedback for individual faculties for their subjects.
        System.out.println("review for faculty 1 is "+ fp.getFacultyReviewAcrossCourses());
        System.out.println("review for faculty 2 is "+ fp2.getFacultyReviewAcrossCourses());
        
        
        //Creating Courses.
        Course webdesign = department.newCourse("WebDesign", "6150", 4);
        Course aed = department.newCourse("AED", "5000", 4);
        Course webtools = department.newCourse("WebTools", "5250", 4);
        Course cloudcomputing = department.newCourse("Cloud Computing", "5700", 4);
        Course algorithms = department.newCourse("Algorithms", "7600", 4);
        Course datascience = department.newCourse("DataScience", "4500", 4);
        Course database = department.newCourse("DataBase", "4200", 4);
        
        department.newCourseSchedule("Spring 2021");
        
        //Creating CourseOffers and adding respective Seats to them.
        CourseOffer webdesignOffer = courseschedule.newCourseOffer("6150");
        webdesignOffer.generatSeats(20);
        CourseOffer aedOffer = courseschedule.newCourseOffer("5000");
        aedOffer.generatSeats(20);
        CourseOffer webtoolsOffer = courseschedule.newCourseOffer("5250");
        webtoolsOffer.generatSeats(20);
        CourseOffer cloudcomputingOffer = courseschedule.newCourseOffer("5700");
        cloudcomputingOffer.generatSeats(20);
        CourseOffer algorithmsOffer = courseschedule.newCourseOffer("7600");
        algorithmsOffer.generatSeats(20);
        CourseOffer datascienceOffer = courseschedule.newCourseOffer("4500");
        datascienceOffer.generatSeats(20);
        CourseOffer databaseOffer = courseschedule.newCourseOffer("4200");
        databaseOffer.generatSeats(20);
        
        Person persons[] = new Person[50];
        for(int i =0;i<50;i++){
            persons[i] = pd.newPerson("100"+i);
        }
        
        StudentProfile[] students = new StudentProfile[20];
        
        for(int i=0,j=0;i<20;i++,j++){
            
            students[i] = sd.newStudentProfile(persons[j]);
        }
        
        
        FacultyProfile[] faculties = new FacultyProfile[7];
        
        for(int i=0,j=20;j<27;i++,j++){
            faculties[i] = fd.newFacultyProfile(persons[j]);
        }
        
        
        FacultyAssignment facultyAssignment1 = faculties[0].AssignAsTeacher(webdesignOffer);
        FacultyAssignment facultyAssignment2 = faculties[1].AssignAsTeacher(aedOffer);
        FacultyAssignment facultyAssignment3 = faculties[2].AssignAsTeacher(webtoolsOffer);
        FacultyAssignment facultyAssignment4 = faculties[3].AssignAsTeacher(cloudcomputingOffer);
        FacultyAssignment facultyAssignment5 = faculties[4].AssignAsTeacher(algorithmsOffer);
        FacultyAssignment facultyAssignment6 = faculties[5].AssignAsTeacher(datascienceOffer);
        FacultyAssignment facultyAssignment7 = faculties[6].AssignAsTeacher(databaseOffer);
        
        
        CourseLoad courseLoad = students[0].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment1 = courseLoad.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment2 = courseLoad.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment3 = courseLoad.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment4 = courseLoad.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment5 = courseLoad.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoads2 = students[1].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment6 = courseLoads2.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment7 = courseLoads2.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment8 = courseLoads2.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment9 = courseLoads2.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment10 = courseLoads2.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad3 = students[2].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment11 = courseLoad3.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment12 = courseLoad3.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment13 = courseLoad3.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment14= courseLoad3.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment15 = courseLoad3.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad4 = students[3].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment16 = courseLoad4.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment17 = courseLoad4.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment18 = courseLoad4.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment19 = courseLoad4.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment20 = courseLoad4.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad5 = students[4].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment21 = courseLoad5.newSeatAssignment(algorithmsOffer);
        SeatAssignment seatAssignment22 = courseLoad5.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment23 = courseLoad5.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment24 = courseLoad5.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment25 = courseLoad5.newSeatAssignment(cloudcomputingOffer);
        
        
        CourseLoad courseLoad6 = students[5].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment26 = courseLoad6.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment27 = courseLoad6.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment28 = courseLoad6.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment29 = courseLoad6.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment30 = courseLoad6.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad7 = students[6].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment31 = courseLoad7.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment32 = courseLoad7.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment33 = courseLoad7.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment34 = courseLoad7.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment35 = courseLoad7.newSeatAssignment(webdesignOffer);
        
        CourseLoad courseLoad8 = students[7].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment36 = courseLoad8.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment37 = courseLoad8.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment38 = courseLoad8.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment39 = courseLoad8.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment40= courseLoad8.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad9 = students[8].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment41 = courseLoad9.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment42 = courseLoad9.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment43 = courseLoad9.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment44 = courseLoad9.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment45 = courseLoad9.newSeatAssignment(datascienceOffer);
        
        CourseLoad courseLoad10 = students[9].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment46 = courseLoad10.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment47 = courseLoad10.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment48 = courseLoad10.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment49 = courseLoad10.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment50 = courseLoad10.newSeatAssignment(datascienceOffer);
        
        CourseLoad courseLoad11 = students[10].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment51 = courseLoad11.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment52 = courseLoad11.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment53 = courseLoad11.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment54 = courseLoad11.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment55 = courseLoad11.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad12 = students[11].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment56 = courseLoad12.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment57 = courseLoad12.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment58 = courseLoad12.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment59 = courseLoad12.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment60 = courseLoad12.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad13 = students[12].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment61 = courseLoad13.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment62 = courseLoad13.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment63 = courseLoad13.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment64 = courseLoad13.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment65 = courseLoad13.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad14 = students[13].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment66 = courseLoad14.newSeatAssignment(cloudcomputingOffer);
        SeatAssignment seatAssignment67 = courseLoad14.newSeatAssignment(webtoolsOffer);
        SeatAssignment seatAssignment68 = courseLoad14.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment69 = courseLoad14.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment70 = courseLoad14.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad15 = students[14].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment71 = courseLoad15.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment72 = courseLoad15.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment73 = courseLoad15.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment74 = courseLoad15.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment75 = courseLoad15.newSeatAssignment(algorithmsOffer);
        
        CourseLoad courseLoad16 = students[15].newCourseLoad("Spring2021");
        SeatAssignment seatAssignment76 = courseLoad16.newSeatAssignment(webdesignOffer);
        SeatAssignment seatAssignment77 = courseLoad16.newSeatAssignment(aedOffer);
        SeatAssignment seatAssignment78 = courseLoad16.newSeatAssignment(datascienceOffer);
        SeatAssignment seatAssignment79 = courseLoad16.newSeatAssignment(databaseOffer);
        SeatAssignment seatAssignment80 = courseLoad16.newSeatAssignment(algorithmsOffer);
        
        
        seatAssignment1.setGrade(7);
        seatAssignment2.setGrade(6);
        seatAssignment3.setGrade(9);
        seatAssignment4.setGrade(8);
        seatAssignment5.setGrade(7);
        seatAssignment6.setGrade(8);
        seatAssignment7.setGrade(6);
        seatAssignment8.setGrade(9);
        seatAssignment9.setGrade(8);
        seatAssignment10.setGrade(4);
        seatAssignment11.setGrade(6);
        seatAssignment12.setGrade(7);
        seatAssignment13.setGrade(9);
        seatAssignment14.setGrade(7);
        seatAssignment15.setGrade(9);
        seatAssignment16.setGrade(7);
        seatAssignment17.setGrade(9);
        seatAssignment18.setGrade(6);
        seatAssignment19.setGrade(9);
        seatAssignment20.setGrade(7);
        seatAssignment21.setGrade(7);
        seatAssignment22.setGrade(9);
        seatAssignment23.setGrade(6);
        seatAssignment24.setGrade(9);
        seatAssignment25.setGrade(8);
        seatAssignment26.setGrade(9);
        seatAssignment27.setGrade(6);
        seatAssignment28.setGrade(0);
        seatAssignment29.setGrade(5);
        seatAssignment30.setGrade(9);
        seatAssignment31.setGrade(5);
        seatAssignment32.setGrade(6);
        seatAssignment33.setGrade(7);
        seatAssignment34.setGrade(9);
        seatAssignment35.setGrade(6);
        seatAssignment36.setGrade(8);
        seatAssignment37.setGrade(7);
        seatAssignment38.setGrade(6);
        seatAssignment39.setGrade(9);
        seatAssignment40.setGrade(8);
        seatAssignment41.setGrade(7);
        seatAssignment42.setGrade(8);
        seatAssignment43.setGrade(6);
        seatAssignment44.setGrade(9);
        seatAssignment45.setGrade(8);
        seatAssignment46.setGrade(4);
        seatAssignment47.setGrade(6);
        seatAssignment48.setGrade(7);
        seatAssignment49.setGrade(9);
        seatAssignment50.setGrade(7);
        seatAssignment51.setGrade(9);
        seatAssignment52.setGrade(7);
        seatAssignment53.setGrade(9);
        seatAssignment54.setGrade(6);
        seatAssignment55.setGrade(9);
        seatAssignment56.setGrade(7);
        seatAssignment57.setGrade(7);
        seatAssignment58.setGrade(9);
        seatAssignment59.setGrade(6);
        seatAssignment60.setGrade(9);
        seatAssignment61.setGrade(8);
        seatAssignment62.setGrade(9);
        seatAssignment63.setGrade(6);
        seatAssignment64.setGrade(0);
        seatAssignment65.setGrade(5);
        seatAssignment66.setGrade(9);
        seatAssignment67.setGrade(5);
        seatAssignment68.setGrade(6);
        seatAssignment69.setGrade(7);
        seatAssignment70.setGrade(9);
        seatAssignment71.setGrade(6);
        seatAssignment72.setGrade(8);
        seatAssignment73.setGrade(0);
        seatAssignment74.setGrade(5);
        seatAssignment75.setGrade(9);
        seatAssignment76.setGrade(5);
        seatAssignment77.setGrade(6);
        seatAssignment78.setGrade(7);
        seatAssignment79.setGrade(9);
        seatAssignment80.setGrade(6);
        
        
        
        
        EmployerDirectory ed = new EmployerDirectory(department);
        
        EmployerProfile google = ed.newEmployerProfile("Google");
        EmployerProfile facebook = ed.newEmployerProfile("Facebook");
        EmployerProfile paypal = ed.newEmployerProfile("PayPal");
        
        
       Employment emp1 = google.AddEmployment("SDE");
       emp1.relevantcourseoffers.add(aedOffer);
       emp1.relevantcourseoffers.add(webdesignOffer);
       
       emp1.setPromotions(5);
       
       Employment emp2 = google.AddEmployment("DE");
       emp2.relevantcourseoffers.add(databaseOffer);
       emp2.relevantcourseoffers.add(datascienceOffer);
       emp2.setPromotions(7);

       
       Employment emp3 = google.AddEmployment("FE");
       emp3.relevantcourseoffers.add(webdesignOffer);
       emp3.relevantcourseoffers.add(webtoolsOffer);
       emp3.setPromotions(3);
       
       Employment emp4 = google.AddEmployment("QA");
       emp4.relevantcourseoffers.add(aedOffer);
       emp4.relevantcourseoffers.add(cloudcomputingOffer);
       emp4.setPromotions(6);
       
       Employment emp5 = google.AddEmployment("SDE");
       emp5.relevantcourseoffers.add(aedOffer);
       emp5.relevantcourseoffers.add(webdesignOffer);
              emp5.setPromotions(6);

       Employment emp6 = google.AddEmployment("DE");
       emp6.relevantcourseoffers.add(databaseOffer);
       emp6.relevantcourseoffers.add(datascienceOffer);
       emp6.setPromotions(7);
       
       Employment emp7 = google.AddEmployment("FE");
       emp7.relevantcourseoffers.add(webdesignOffer);
       emp7.relevantcourseoffers.add(webtoolsOffer);
       emp7.setPromotions(2);
       
       
       Employment emp8 = google.AddEmployment("QA");
       emp8.relevantcourseoffers.add(aedOffer);
       emp8.relevantcourseoffers.add(cloudcomputingOffer);
              emp8.setPromotions(1);

       
       Employment emp9 = google.AddEmployment("SDE");
       emp9.relevantcourseoffers.add(aedOffer);
       emp9.relevantcourseoffers.add(webdesignOffer);
              emp9.setPromotions(5);

       
       Employment emp10 = google.AddEmployment("DE");
       emp10.relevantcourseoffers.add(databaseOffer);
       emp10.relevantcourseoffers.add(datascienceOffer);
              emp10.setPromotions(4);

       
       Employment emp11 = google.AddEmployment("FE");
       emp11.relevantcourseoffers.add(webdesignOffer);
       emp11.relevantcourseoffers.add(webtoolsOffer);
              emp11.setPromotions(8);

       
       Employment emp12 = google.AddEmployment("QA");
       emp12.relevantcourseoffers.add(aedOffer);
       emp12.relevantcourseoffers.add(cloudcomputingOffer);
              emp12.setPromotions(4);

       
       Employment emp13 = google.AddEmployment("SDE");
       emp13.relevantcourseoffers.add(aedOffer);
       emp13.relevantcourseoffers.add(webdesignOffer);
              emp13.setPromotions(8);

       
       Employment emp14 = google.AddEmployment("DE");
       emp14.relevantcourseoffers.add(databaseOffer);
       emp14.relevantcourseoffers.add(datascienceOffer);
              emp14.setPromotions(5);

       
       Employment emp15 = google.AddEmployment("FE");
       emp15.relevantcourseoffers.add(webdesignOffer);
       emp15.relevantcourseoffers.add(webtoolsOffer);
              emp15.setPromotions(8);

       
       Employment emp16 = google.AddEmployment("QA");
       emp16.relevantcourseoffers.add(aedOffer);
       emp16.relevantcourseoffers.add(cloudcomputingOffer);
              emp16.setPromotions(8);

       
       Employment emp17 = google.AddEmployment("SDE");
       emp17.relevantcourseoffers.add(aedOffer);
       emp17.relevantcourseoffers.add(webdesignOffer);
              emp17.setPromotions(8);

       
       Employment emp18 = google.AddEmployment("DE");
       emp18.relevantcourseoffers.add(databaseOffer);
       emp18.relevantcourseoffers.add(datascienceOffer);
              emp18.setPromotions(8);

       
       Employment emp19 = google.AddEmployment("FE");
       emp19.relevantcourseoffers.add(webdesignOffer);
       emp19.relevantcourseoffers.add(webtoolsOffer);
              emp19.setPromotions(8);

       
       Employment emp20 = google.AddEmployment("QA");
       emp20.relevantcourseoffers.add(aedOffer);
       emp20.relevantcourseoffers.add(cloudcomputingOffer);
              emp20.setPromotions(8);

       
       
        students[0].AddEmployment(emp1);
        /*Transcript transcript1 = students[0].AddTranscript();
        CourseLoad cl1 = transcript1.AddCourseLoad("Spring 2021");
        cl1.s
        students[0].setTranscript(transcript1);*/
        students[1].AddEmployment(emp2);
        students[2].AddEmployment(emp3);
        students[3].AddEmployment(emp4);
        students[4].AddEmployment(emp5);
        students[5].AddEmployment(emp6);
        students[6].AddEmployment(emp7);
        students[7].AddEmployment(emp8);
        students[8].AddEmployment(emp9);
        students[9].AddEmployment(emp10);
        students[10].AddEmployment(emp11);
        students[11].AddEmployment(emp12);
        students[12].AddEmployment(emp13);
        students[13].AddEmployment(emp14);
        students[14].AddEmployment(emp15);
        students[15].AddEmployment(emp16);
        students[16].AddEmployment(emp17);
        students[17].AddEmployment(emp18);
        students[18].AddEmployment(emp19);
        students[19].AddEmployment(emp20);

        HashMap<Course,Integer> courseRank = department.getMostPopularCourse();
        System.out.println("The Course Ranking based on job quality is as follows ");
        for(Course cour: courseRank.keySet()){
            System.out.println(cour.getName());
        }

        
        HashMap<StudentProfile,Integer> studentRank = sd.RankStudentsBasedOnPromotions();
        System.out.println("The ranks of students based on the quality are:");
        for(StudentProfile spr: studentRank.keySet()){
            System.out.println(spr.getPerson().getPersonId());
        }
        
        System.out.println("The quality of the department Information Systems is: "+ department.DepartmentQuality()*100+"%");
        
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total: " + total);

    }

}
