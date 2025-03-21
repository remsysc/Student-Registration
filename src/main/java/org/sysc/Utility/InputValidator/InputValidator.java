package org.sysc.Utility.InputValidator;

import org.apache.commons.validator.routines.EmailValidator;
import org.sysc.Service.StudentService.StudentService;

public class InputValidator
{


    public  static  String validConfirmPassword(String password, String password_2){
        if(!password.equals(password_2)){
            return "Password do not match.";
        }
        return "";
    }

    public static String validPassword(String password){

        if(password.length() >= 8){
           return "";
        }

        return "Password must be at least 8 characters.";

    }


    public  static String confirmEmail(String email, String email_2){

        if(EmailValidator.getInstance().isValid(email)){
            if(!email.equals(email_2)){
                return "Email do not match.";
            }
        }else{
            return "Must be a valid Email Address.";
        }

        return  "";

    }

 public static String validUserName(String username, StudentService studentService){

     if(username == null || username.trim().isEmpty()){
         return "Username is required.";
     }
     if(studentService.isUsernameTaken(username)){
         return "Username is already taken.";
     }

     return "";
 }
    public static String validContactNumber(String num) {
        // Check if the input is a valid numeric value
        try {
            Long.parseLong(num); // Use Long for larger numbers
        } catch (NumberFormatException e) {
            return "Must be numbers only.";
        }

        // Check the length of the contact number
        if (num.length() != 11) {
            return "Number must be 11 digits only.";
        }

        // Check if the contact number starts with "09"
        if (!num.startsWith("09")) {
            return "Number must start with '09'.";
        }

        return ""; // Return an empty string if no errors
    }

    public static String validEmailAddress(String email){


    if(!EmailValidator.getInstance().isValid(email)){
        return "Must be a valid Email Address.";
    }
    return "";

    }

    public static String validName(String firstName){

        if(firstName == null || firstName.trim().isEmpty() )
            return "This field is required.";
        else if(containsNumber(firstName))
                return "Name cannot contain a number.";
        return "";
    }

    public  static  String validText(String input){
        if(input == null || input.trim().isEmpty() )
            return "This field is required.";

        return "";
    }

    public static  boolean containsNumber(String input){


        return input.matches(".*\\d.*"); // ".*" matches anything before or after the digit
    }


    public static String validNumber(String num) {
        try {
            int age =Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return "Must be a valid number!";
        }

        return "";
    }



}
