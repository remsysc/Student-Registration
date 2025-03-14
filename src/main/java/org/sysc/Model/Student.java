package org.sysc.Model;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String course;
    private String address;
    private int contact;
    private int yearLvl;
    private String userName;
    private  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


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




        public Student(String firstName, String lastName, String userName, String password){
            this.firstName = firstName;
            this.lastName = lastName;

        }

}
