package org.sysc.Service.StudentService;

import org.sysc.Model.Student;
import org.sysc.Model.StudentManager;

public class StudentService {
    private final StudentManager studentManager;

    public StudentService(int capacity) {
        this.studentManager = new StudentManager(capacity); // Initialize with capacity
    }

    public boolean addStudent(String firstName, String middleName, String lastName, String birthday, String address,
                              String contactNumber, int studentNumber, String academicStanding, String yearLvl,
                              String collegeDepartment, String program, String section, String ACA,
                              String membershipRole, String officership, String username, String password) {

        // Validate username
        if (studentManager.isUsernameTaken(username)) {
            return false; // Username already exists
        }

        // Create a Student object
        String emailAddress = "";
        Student student = new Student(firstName, middleName, lastName, birthday, address, contactNumber,
                studentNumber, academicStanding, yearLvl, collegeDepartment, program, section,
                ACA, membershipRole, officership, username, password, emailAddress);

        // Add the student
        return studentManager.addStudent(student);
    }

    public int getStudentCount() {
        return studentManager.getStudentCount();
    }
    public Student[] getAllStudents(){
        return studentManager.getAllStudents();
    }
    public boolean isUsernameTaken(String username) {
        return studentManager.isUsernameTaken(username);
    }
}
