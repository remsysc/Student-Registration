package org.sysc.Model;

public class Student {

    private String firstName;


    private String middleName;
    private String lastName;
    private String birthday;
    private String address;


    private String contactNumber;
    private int studentNumber;

    private String academicStanding;
    private String yearLvl;
    private String collegeDeparment;
    private String program;
    private String section;

    private String ACA;
    private String membershipRole;
    private String officership;


    private String username;
    private  String password;
    private String emailAddress;



    public Student(String firstName, String middleName, String lastName, String birthday, String address, String contactNumber,
                   int studentNumber, String academicStanding, String yearLvl, String collegeDeparment, String program, String section,
                   String ACA, String membershipRole, String officership, String username, String password, String emailAddress) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.contactNumber = contactNumber;
        this.studentNumber = studentNumber;
        this.academicStanding = academicStanding;
        this.yearLvl = yearLvl;
        this.collegeDeparment = collegeDeparment;
        this.program = program;
        this.section = section;
        this.ACA = ACA;
        this.membershipRole = membershipRole;
        this.officership = officership;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getAcademicStanding() {
        return academicStanding;
    }

    public String getYearLvl() {
        return yearLvl;
    }

    public String getCollegeDeparment() {
        return collegeDeparment;
    }

    public String getProgram() {
        return program;
    }

    public String getSection() {
        return section;
    }

    public String getACA() {
        return ACA;
    }

    public String getMembershipRole() {
        return membershipRole;
    }

    public String getOfficership() {
        return officership;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return emailAddress;
    }



}
