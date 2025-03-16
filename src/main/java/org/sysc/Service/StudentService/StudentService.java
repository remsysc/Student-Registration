package org.sysc.Service.StudentService;

import org.sysc.Model.Student;
import org.sysc.Model.StudentManager;

public class StudentService {
    private StudentManager studentManager;

    public StudentService(int capacity) {
        // Initialize StudentManager with the given capacity
        this.studentManager = new StudentManager(capacity);
    }

    // Wrapper method to add a student
    public boolean addStudent(String firstName, String lastName) {
        Student student = new Student(firstName, lastName);
        return studentManager.addStudent(student);
    }

    // Wrapper method to get the total number of students
    public int getStudentCount() {
        return studentManager.getStudentCount();
    }
}
