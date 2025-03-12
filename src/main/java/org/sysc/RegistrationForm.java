package org.sysc;

import org.sysc.Model.Student;
import org.sysc.Model.StudentManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JPanel MainPanel;
    private JLabel lblFirstName;
    private JTextField tfFirstName;
    private JLabel lblLastName;
    private JTextField tfLastName;
    private JButton btnSignUp;
    private JLabel lblUserName;
    private JTextField tfUserName;
    private JLabel lblPassword;
    private JPasswordField pfPassword;

    private final StudentManager studentManager;
    RegistrationForm(){
        studentManager = new StudentManager(100);
        setContentPane(MainPanel);
        setTitle("Rem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,960);
        setVisible(true);
        setResizable(false);
        btnSignUp.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                char[] passwordChars = pfPassword.getPassword();
                String password = new String(passwordChars);
                Student  student =   new Student(tfFirstName.getText(), tfLastName.getText(), tfUserName.getText(), password);
                if(!studentManager.addStudent(student)){
                    JOptionPane.showMessageDialog(null, "No more space available.");
                }else{
                    JOptionPane.showMessageDialog(null, "Student Added: " + student.getFirstName() + " " + student.getLastName());
                }
            }
        });
    }

}
