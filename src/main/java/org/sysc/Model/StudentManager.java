package org.sysc.Model;

import java.util.Arrays;

//manage the student class
// creates a loop of student
// acting as temp. database

public class StudentManager {
    private final Student[] students;
    private int studentCount;
    public  StudentManager(int capacity){
        students = new Student[capacity];
        studentCount = 0;
    }

    public boolean addStudent(Student student){
        if (studentCount >= students.length) {
            return false; // Capacity reached
        }
        students[studentCount] = student;
        studentCount++;

        return true;
    }
    public int getStudentCount() {
        return studentCount;
    }

    public boolean isUsernameTaken(String username){
        for(int i =0; i < studentCount;i++){
            if(students[i].getUsername().equalsIgnoreCase(username)){
                return true;
            }
        }

        return false;
    }

    public Student[] getAllStudents() {
        for(int i = 0; i < studentCount;i++){
            Student student = students[i];
        };
        return  students;
}
}
