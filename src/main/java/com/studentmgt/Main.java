package com.studentmgt;

import com.studentmgt.student.entities.Staff;
import com.studentmgt.student.entities.Student;
import com.studentmgt.student.serviceImpl.StudentServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // STAFF CONSTRUCTOR
        //User user = new User();
//        Staff teacher = new Staff(001, "teacher");
//
//        System.out.println(teacher.getIdNumber());
//        teacher.setIdNumber(003);
//
//        System.out.println(teacher.getIdNumber());

        Student obj = new Student("Biology", LocalDate.now(),321,"Science","Credit",3);
        System.out.println(obj.getCourse());
        System.out.println(obj.getYearOfAdmission());
        System.out.println(obj.getCourseIdNumber());
        System.out.println(obj.getCourseDescription());
        System.out.println(obj.getCourseRemarks());
        System.out.println(obj.getCourseUnits());

        StudentServiceImpl ssi = new StudentServiceImpl();
        ssi.admit();
        ssi.award();
        ssi.suspend();
//
//        Staff staff = new Staff("teacher");
//        System.out.println(staff.area(20));
//        System.out.println(staff.area(5,4));



    }
}