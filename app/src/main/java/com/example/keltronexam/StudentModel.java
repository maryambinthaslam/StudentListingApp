package com.example.keltronexam;


public class StudentModel {

    // variables for our coursename,
    // description, tracks and duration, id.
    private String studentName;
    private String studentEmail;
    private String admissionYear;
    private String studentDepartment;
    private int id;

    // creating getter and setter methods
    public String getCourseName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // constructor
    public StudentModel(String studentName, String studentEmail, String admissionYear, String studentDepartment) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.admissionYear = admissionYear;
        this.studentDepartment = studentDepartment;
    }
}
