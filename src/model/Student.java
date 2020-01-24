package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private int id;
    private String name;
    private HashMap<Integer, Double> grades;
    private ArrayList<Course> enrolledCourses;

    public Student(int aID, String aName){
        id = aID;
        name = aName;
        grades = new HashMap<>();
        enrolledCourses = new ArrayList<>();
    }

    public void displayCourses(){
        System.out.printf("%s's Classes\n",this.name);
        for (Course aClass : enrolledCourses){
            System.out.printf("Class Name: %s\n Description: %s\n Credits: %d\n\n", aClass.getName(), aClass.getDescription(), aClass.getCredit());
        }
    }

    public double calculateGPA(){
        int totalCredits = 0;
        for (Course aClass : enrolledCourses){
            totalCredits += aClass.credit;
        }
        double totalGrades = 0;
        for (int i = 0; i < grades.size(); i++){
            double grade = grades.get(i+1)/100;
            int credit = enrolledCourses.get(i).credit;
            double calculatedGrade = credit * grade;
            totalGrades += calculatedGrade;
        }
        double finalGPA = totalGrades/totalCredits;
        return finalGPA*4;
    }

    public void enrollCourse(Course aCourse){
        enrolledCourses.add(aCourse);
    }

    public boolean setGrade(Course aCourse, double aGrade){
        if(enrolledCourses.contains(aCourse)){
            grades.put(aCourse.getID(), aGrade);
            return true;
        } else {
            return false;
        }
    }

    public int getEnrolledCourses(){
        return enrolledCourses.size();
    }
}
