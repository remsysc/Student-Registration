package org.sysc.Service.StudentService;

import org.sysc.Model.Student;
import org.sysc.Model.StudentManager;

public class StudentService {
    private final StudentManager studentManager;

    public StudentService(int capacity) {
        // Initialize StudentManager with the given capacity
        this.studentManager = new StudentManager(capacity);
    }

    // Wrapper method to add a student
    public boolean addStudent(String username) {
        Student student = new Student(username);
        return studentManager.addStudent(student);
    }

    // Wrapper method to get the total number of students
    public int getStudentCount() {
        return studentManager.getStudentCount();
    }

    public boolean isUsernameTaken(String username){

        return studentManager.isUsernameTaken(username);
    }
}
