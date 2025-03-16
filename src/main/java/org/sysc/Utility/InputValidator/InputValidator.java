package org.sysc.Utility.InputValidator;

public class InputValidator
{


    public static String validateName(String firstName){

        if(firstName == null || firstName.trim().isEmpty() )
            return "First name is required.";
        else if(containsNumber(firstName))
                return "Name cannot contain a number.";
        return "";
    }

    public static  boolean containsNumber(String input){

        return input.matches(".*\\d.*"); // ".*" matches anything before or after the digit
    }

    public static String validateAge(String num) {
        try {
            int age =Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return "Age must be a valid number!";
        }

        return "";
    }
    public static String validateContact(String num) {
    try {
        int age =Integer.parseInt(num);
    } catch (NumberFormatException e) {
        return "Contact # must be a valid number!";
    }

    return "";
}


}
