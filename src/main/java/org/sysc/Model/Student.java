package org.sysc.Model;

public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private  String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




        public Student(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;

        }

}
