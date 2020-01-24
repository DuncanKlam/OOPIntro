package src;

import model.Course;
import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student stevenStephens = new Student(1235, "Steven Stephens");
    Course CS222 = new Course(1,234,"CS222","Computer Science 222: Advanced Programming ", 3);
    Course ENG285 = new Course (2,235, "ENG285", "English 285: Creative Writing", 3);


    @Test
    void enrollCourseTest() {
        stevenStephens.enrollCourse(CS222);
        assertEquals(1,stevenStephens.getEnrolledCourses());
    }

    @Test
    void setGradeEnrolledTest() {
        stevenStephens.enrollCourse(CS222);
        if(stevenStephens.setGrade(CS222,86.2)){
            System.out.println("Asserted true");
        }

    }

    @Test
    void setGradeNotEnrolledTest() {
        if(!stevenStephens.setGrade(ENG285,34.5)){
            System.out.println("Asserted false");
        }
    }

    @Test
    void calculateGPATest() {
        stevenStephens.enrollCourse(CS222);
        stevenStephens.enrollCourse(ENG285);
        stevenStephens.setGrade(CS222,85);
        stevenStephens.setGrade(ENG285,35);
        assertEquals(2.4,stevenStephens.calculateGPA());
    }
}