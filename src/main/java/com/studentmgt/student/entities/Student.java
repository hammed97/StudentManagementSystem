package com.studentmgt.student.entities;

import java.time.LocalDate;

public class Student extends User {
    private String course;
    private LocalDate yearOfAdmission;
    private String courseDescription;
    private String courseRemarks;
    private int courseUnits;


    //GETTERS AND SETTERS


    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", courseIdNumber=" + courseIdNumber +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseRemarks='" + courseRemarks + '\'' +
                ", courseUnits=" + courseUnits +
                '}';
    }

    private int courseIdNumber;

    public Student(String course, LocalDate yearOfAdmission, int courseIdNumber, String courseDescription, String courseRemarks, int courseUnits) {
        this.course = course;
        this.yearOfAdmission = yearOfAdmission;
        this.courseIdNumber = courseIdNumber;
        this.courseDescription = courseDescription;
        this.courseRemarks = courseRemarks;
        this.courseUnits = courseUnits;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(LocalDate yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getCourseIdNumber() {
        return courseIdNumber;
    }

    public void setCourseIdNumber(int courseIdNumber) {
        this.courseIdNumber = courseIdNumber;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseRemarks() {
        return courseRemarks;
    }

    public void setCourseRemarks(String courseRemarks) {
        this.courseRemarks = courseRemarks;
    }

    public int getCourseUnits() {
        return courseUnits;
    }

    public void setCourseUnits(int courseUnits) {
        this.courseUnits = courseUnits;
    }
}
