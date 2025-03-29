package org.sysc;

import org.sysc.Model.StudentManager;
import org.sysc.Service.StudentService.StudentService;
import org.sysc.Utility.InputValidator.InputValidator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class RegistrationForm extends JPanel {
    private JPanel MainPanel;
    private JLabel lblFirstName;
    private JTextField tfFirstName;
    private JLabel lblLastName;
    private JTextField tfLastName;
    private JButton btnSignUp;
    private JLabel lblUsername;
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
    private JTextField tfMiddleName;
    private JLabel lblMiddleName;
    private JTextField tfStudentNumber;
    private JLabel lblStudentNumber;
    private JLabel lblCollegeProgram;
    private JLabel lblAcademicStanding;
    private JLabel lblSection;
    private JTextField tfEmail;
    private JLabel lblMiddleNameError;
    private JLabel lblEmail;
    private JTextField tfAddress;
    private JTextField tfBirthday;
    private JTextField tfMembershipRole;
    private JTextField tfOfficership;
    private JLabel lblBirthday;
    private JLabel lblACA;
    private JLabel lblMembershipRole;
    private JLabel lblOfficership;
    private JLabel lblAddress;
    private JLabel lblConfirmEmail;
    private JLabel lblConfirmPassword;
    private JTextField tfConfirmEmail;
    private JPasswordField pfConfirmPassword;
    private JTextField tfSection;
    private JRadioButton rbDSA;
    private JRadioButton rbDST;
    private JRadioButton rbIDDC;
    private JRadioButton rbPL;
    private JRadioButton rbRegular;
    private JRadioButton rbIrregular;
    private JRadioButton rb1stYear;
    private JRadioButton rb2ndYear;
    private JTextField tfCollegeDepartmentProgram;
    private JTextField tfProgram;
    private JRadioButton rb3rdYear;
    private JRadioButton rb4thYear;
    private JLabel lblStudentNumberError;
    private JLabel lblCollegeDepartmentProgramError;
    private JLabel lblProgramError;
    private JLabel lblSectionError;
    private JLabel lblEmailError;
    private JLabel lblContactNumberError;
    private JLabel lblMembershipRoleError;
    private JLabel lblOfficershipRoleError;
    private JLabel lblUsernameError;
    private JLabel lblBirthdayError;
    private JLabel lblAddressError;
    private JLabel lblConfirmEmailError;
    private JLabel lblPasswordError;
    private JLabel lblConfirmPasswordError;
    private JButton btnRegisteredStudents;
    private JLabel lblRegistered;
    private JLabel lblStudentInfo;

    private StudentDetails studentDetailsWindow;


    private  final StudentService studentService;
    RegistrationForm() {

        studentService = new StudentService(100);



        setLayout(new BorderLayout());
        add(MainPanel, BorderLayout.CENTER);
        // Wrap MainPanel in a JScrollPane



        // ActionListener for the "Show Details" button
        btnRegisteredStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (studentDetailsWindow == null || !studentDetailsWindow.isDisplayable()) {
                    // Create a new instance if it doesn't exist or has been closed
                    studentDetailsWindow = new StudentDetails(studentService.getAllStudents(), studentService.getStudentCount());
                } else {
                    // Bring the existing window to the front
                    studentDetailsWindow.toFront();
                }
            }
        });


        btnSignUp.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                if (validateForm()) {
                    // Extract all field values
                    String firstName = tfFirstName.getText();
                    String middleName = tfMiddleName.getText();
                    String lastName = tfLastName.getText();
                    String birthday = tfBirthday.getText();
                    String address = tfAddress.getText();
                    String contactNumber = tfContact.getText();
                    int studentNumber = Integer.parseInt(tfStudentNumber.getText());
                    String academicStanding = rbRegular.isSelected() ? "Regular" : "Irregular"; // Example for radio buttons
                    String yearLvl = rb1stYear.isSelected() ? "1st Year"
                            : rb2ndYear.isSelected() ? "2nd Year"
                            : rb3rdYear.isSelected() ? "3rd Year" : "4th Year";
                    String collegeDepartmentProgram = tfCollegeDepartmentProgram.getText();
                    String section = tfSection.getText();
                    String ACA = rbDSA.isSelected() ? "Dangal Singing Ambassadors"
                            : rbDST.isSelected() ? "Dangal Singing Tanghalan"
                            : rbIDDC.isSelected() ? "Indak Dangal Dance Company"
                            : "Pnc Lente";

                    String membershipRole = tfMembershipRole.getText();
                    String officership = tfOfficership.getText();
                    String username = tfUserName.getText();
                    String password = new String(pfPassword.getPassword());
                    String emailAddress = tfEmail.getText();

                    // Add the student using the service
                    if (studentService.addStudent(firstName,  middleName, lastName,birthday,address, contactNumber,
                            studentNumber, academicStanding,  yearLvl,  collegeDepartmentProgram,section,
                            ACA,  membershipRole, officership, username, password,  emailAddress)) {
                        JOptionPane.showMessageDialog(null, "Form submitted successfully!");
                        clearFormFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to add student. Username may already exist or another issue occurred.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please correct the highlighted errors.");
                }
            }
        });


    }
    private boolean validateForm() {
        // Map error labels to their validation messages
        Map<JLabel, String> errorMessages = new HashMap<>();
        errorMessages.put(lblFirstNameError, InputValidator.validName(tfFirstName.getText()));
        errorMessages.put(lblLastNameError, InputValidator.validName(tfLastName.getText()));
        errorMessages.put(lblMiddleNameError, InputValidator.validName(tfMiddleName.getText()));
        errorMessages.put(lblStudentNumberError, InputValidator.validNumber(tfStudentNumber.getText()));
        errorMessages.put(lblCollegeDepartmentProgramError, InputValidator.validText(tfCollegeDepartmentProgram.getText()));
        errorMessages.put(lblSectionError, InputValidator.validText(tfSection.getText()));
        errorMessages.put(lblEmailError, InputValidator.validEmailAddress(tfEmail.getText()));
        errorMessages.put(lblContactNumberError, InputValidator.validContactNumber(tfContact.getText()));
        errorMessages.put(lblMembershipRoleError, InputValidator.validText(tfMembershipRole.getText()));
        errorMessages.put(lblUsernameError,InputValidator.validUserName(tfUserName.getText(), studentService));
        errorMessages.put(lblBirthdayError,InputValidator.validText(tfBirthday.getText()));
        errorMessages.put(lblAddressError, InputValidator.validText(tfAddress.getText()));
        errorMessages.put(lblConfirmEmailError, InputValidator.confirmEmail(tfEmail.getText(), tfConfirmEmail.getText()));
        errorMessages.put(lblPasswordError, InputValidator.validPassword(new String(pfPassword.getPassword())));
        errorMessages.put(lblConfirmPasswordError, InputValidator.validConfirmPassword(new String(pfPassword.getPassword()), new String(pfConfirmPassword.getPassword())));
        // Clear and update all error messages
        boolean hasError = false;
        for (Map.Entry<JLabel, String> entry : errorMessages.entrySet()) {
            JLabel errorLabel = entry.getKey();
            String errorMessage = entry.getValue();
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.RED);
            if (!errorMessage.isEmpty()) {
                hasError = true;
            }
        }
        return !hasError; // Return true if no errors
    }
    private void clearFormFields() {
        tfFirstName.setText("");
        tfMiddleName.setText("");
        tfLastName.setText("");
        tfBirthday.setText("");
        tfAddress.setText("");
        tfContact.setText("");
        tfStudentNumber.setText("");
        tfCollegeDepartmentProgram.setText("");
        tfSection.setText("");
        tfMembershipRole.setText("");
        tfOfficership.setText("");
        tfUserName.setText("");
        pfPassword.setText("");
        tfEmail.setText("");
        tfConfirmEmail.setText("");
        pfConfirmPassword.setText("");

        rbRegular.setSelected(false);
        rbIrregular.setSelected(false);
        rb1stYear.setSelected(false);
        rb2ndYear.setSelected(false);
        rb3rdYear.setSelected(false);
        rb4thYear.setSelected(false);
        rbDSA.setSelected(false);
        rbDST.setSelected(false);
        rbIDDC.setSelected(false);
        rbPL.setSelected(false);

        // Clear error labels
        lblFirstNameError.setText("");
        lblLastNameError.setText("");
        lblMiddleNameError.setText("");
        lblStudentNumberError.setText("");
        lblCollegeDepartmentProgramError.setText("");
        lblSectionError.setText("");
        lblEmailError.setText("");
        lblContactNumberError.setText("");
        lblMembershipRoleError.setText("");
        lblUsernameError.setText("");
        lblBirthdayError.setText("");
        lblAddressError.setText("");
        lblConfirmEmailError.setText("");
        lblPasswordError.setText("");
        lblConfirmPasswordError.setText("");
    }

}
