package com.studentmgt.student.entities;

public class Staff extends User {
    private int idNumber;
    private String role;


    //CONSTRUCTOR
    public Staff(int idNumber, String role) {
        this.idNumber = idNumber;
        this.role = role;
    }

//    public Staff(String role) {
//        System.out.println("My role is " + role);
//    }

    @Override
    public String toString() {
        return "Staff{" +
                "idNumber=" + idNumber +
                ", role='" + role + '\'' +
                '}';
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    //POLYMORPHISM - SAME FORM BUT DIFFERENT IMPLEMENTATION (METHOD OVER-LOADING)


//    public double area(double radius) {
//        return 3.14 * radius;
//    }
//
//    public double area(double length, double breadth) {
//        return (length * breadth)/ 2;
//    }
}
