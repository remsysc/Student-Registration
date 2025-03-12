package org.sysc.Model;

public class StudentManager {
    private final Student[] students;
    private int studentCount;
    public StudentManager(int capacity){
        students = new Student[capacity];
        studentCount = 0;
    }

    public boolean addStudent(Student student){
        if(studentCount > students.length){
            return  false;
        }
        students[studentCount] = student;
        studentCount++;
        return true;
    }
    public int getStudentCount() {
        return studentCount;
    }
}
