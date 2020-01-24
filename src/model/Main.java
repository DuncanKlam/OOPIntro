package model;

public class Main {
    public static void main(String[] args){
        Course CS222 = new Course(1,234,"CS222","Computer Science 222: Advanced Programming ", 3);
        Course ENG285 = new Course (2,235, "ENG285", "English 285: Creative Writing", 3);
        Course TCOM334 = new Course(3,236, "TCOM334", "Telecommunications 334: Advanced Video Production", 3);
        Course COMM210 = new Course(4,237, "COMM210", "Communications 210: Public Speaking", 3);
        Course CS230 = new Course(5, 238, "CS230", "Computer Science 230: Computer Systems", 3);
        Student johnJames = new Student(1234, "John James");
        Student stevenStephens = new Student(1235, "Steven Stephens");
        Student jerryBarnes = new Student(1236, "Jerry Barnes");

        johnJames.enrollCourse(CS222);
        johnJames.enrollCourse(ENG285);
        stevenStephens.enrollCourse(CS222);
        stevenStephens.enrollCourse(CS230);
        jerryBarnes.enrollCourse(COMM210);
        jerryBarnes.enrollCourse(TCOM334);

        johnJames.displayCourses();
        stevenStephens.displayCourses();
        jerryBarnes.displayCourses();
    }
}
