package org.sysc;

import org.sysc.Model.StudentManager;

import org.sysc.Utility.InputValidator.InputValidator;



import javax.swing.*;
import java.awt.*;
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
    private JTextField tfAge;
    private JLabel lblContact;
    private JTextField tfContact;
    private JLabel lblYearLvl;
    private JLabel lblFirstNameError;
    private JLabel lvlAgeError;
    private JLabel lblLastNameError;
    private JTextField textField1;
    private JLabel lblMiddleName;
    private JTextField textField4;
    private JLabel lblStudentNumber;
    private JLabel lblCollegeDepartment;
    private JLabel lblAcademicStanding;
    private JLabel lblSection;
    private JTextField tfEmail;
    private JLabel lblMiddleNameError;
    private JLabel lblEmail;
    private JTextField tfAddress;
    private JTextField tfBirthday;
    private JTextField tfMember;
    private JTextField tfOffiver;
    private JLabel lblBirthday;
    private JLabel lblACA;
    private JLabel lblMember;
    private JLabel lblOfficer;
    private JLabel lblAddress;
    private JLabel lblConfirmEmail;
    private JLabel lblConfirmPassword;
    private JTextField tfConfirmEmail;
    private JPasswordField pfConfirmPassword;
    private JTextField tfSection;
    private JRadioButton rdDSA;
    private JRadioButton rdDST;
    private JRadioButton rdIDDC;
    private JRadioButton rdPL;
    private JRadioButton rbRegular;
    private JRadioButton rbIrregular;
    private JRadioButton rb1stYear;
    private JRadioButton rb2ndYear;
    private JLabel lblProgram;
    private JTextField tfCollegeDepartment;
    private JTextField tfProgram;
    private JRadioButton rb3rdYear;
    private JRadioButton rb4thYear;

    private final StudentManager studentManager;
    RegistrationForm(){
        studentManager = new StudentManager(100);
        setContentPane(MainPanel);
        // Wrap MainPanel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(MainPanel);

        // Add the JScrollPane to the JFrame
        setContentPane(scrollPane);
        setTitle("Rem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024,768);
        setVisible(true);
        btnSignUp.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
               String firstNameError = InputValidator.validateName(tfFirstName.getText());
               String lastNameError = InputValidator.validateName(tfLastName.getText());
               String ageError = InputValidator.validateAge(tfAge.getText());
               lvlAgeError.setText(ageError);
               lvlAgeError.setForeground(Color.red);
               lblFirstNameError.setText(firstNameError);
               lblFirstNameError.setForeground(Color.red);
               lblLastNameError.setText(lastNameError);
               lblLastNameError.setForeground(Color.red);
            }
        });





    }

}
