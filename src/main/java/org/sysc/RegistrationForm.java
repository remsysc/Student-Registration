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
    private JLabel lblAge;
    private JTextField tfAge;
    private JLabel lblGender;
    private JLabel lblContact;
    private JTextField tfContact;
    private JLabel lblYearLvl;
    private JRadioButton rbOption2;
    private JRadioButton rbOption1;
    private JRadioButton rbOption3;
    private JRadioButton a4thRadioButton;
    private JLabel lblFirstNameError;
    private JLabel lvlAgeError;
    private JLabel lblLastNameError;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton BSCSRadioButton;
    private JRadioButton BSITRadioButton;
    private JRadioButton BSBAMRadioButton;
    private JRadioButton bullShitRadioButton;

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
