package org.sysc;

import org.sysc.Model.Student;

import javax.swing.*;

//driver code
public class Main {
    public static void main(String[] args) {

        // this a bad workaround for replit to work
        // better to clone it from github : https://github.com/remsysc/Student-Registration.git
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame to host the registration form panel.
            JFrame frame = new JFrame("Arts and Culture Affairs Registration");

            // Create an instance of RegistrationForm (which is now a JPanel)
            RegistrationForm regFormPanel = new RegistrationForm();

            // Optionally wrap the registration form panel in a JScrollPane
            JScrollPane scrollPane = new JScrollPane(regFormPanel);
            frame.setContentPane(scrollPane);

            // Configure the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1440, 900);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}