package org.sysc;

import org.sysc.Model.Student;

import javax.swing.*;

//simply loops the array of students and showing each object's data.

//better to convert this to a dialog, but im lazy.

public class StudentDetails extends JFrame {
    private JTextArea textArea;
    private JPanel panel1;

    public StudentDetails(Student[] students, int studentCount) {
        setTitle("Registered Students");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        setLocationRelativeTo(null); // Center the window
        setContentPane(panel1);
        // Create a JTextArea to display student details

        textArea.setEditable(false); // Make it read-only
        JScrollPane scrollPane = new JScrollPane(textArea); // Add a scroll pane for long lists

        // Build the content to display
        StringBuilder details = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            details.append("Student #").append(i + 1).append(":\n");
            details.append("Name: ").append(student.getFirstName()).append(" ")
                    .append(student.getMiddleName()).append(" ")
                    .append(student.getLastName()).append("\n");
            details.append("Birthday: ").append(student.getBirthday()).append("\n");
            details.append("Address: ").append(student.getAddress()).append("\n");
            details.append("Contact Number: ").append(student.getContactNumber()).append("\n");
            details.append("Student Number: ").append(student.getStudentNumber()).append("\n");
            details.append("Academic Standing: ").append(student.getAcademicStanding()).append("\n");
            details.append("Year Level: ").append(student.getYearLvl()).append("\n");
            details.append("College Department: ").append(student.getCollegeDepartmentProgram()).append("\n");
            details.append("Section: ").append(student.getSection()).append("\n");
            details.append("ACA: ").append(student.getACA()).append("\n");
            details.append("Membership Role: ").append(student.getMembershipRole()).append("\n");
            details.append("Officership: ").append(student.getOfficership()).append("\n");
            details.append("Username: ").append(student.getUsername()).append("\n");
            details.append("Email: ").append(student.getEmail()).append("\n");
            details.append("--------------------------------------------\n");
        }
        // Set the content to the text area
        textArea.setText(details.toString());

        // Add the scroll pane to the frame
        add(scrollPane);
        setVisible(true);
    }
}
