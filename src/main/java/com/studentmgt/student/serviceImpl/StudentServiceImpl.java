package com.studentmgt.student.serviceImpl;

import com.studentmgt.student.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void admit() {
        System.out.println("Sola had been admitted");
    }

    @Override
    public void suspend() {
        System.out.println("She had been suspended");

    }

    @Override
    public void award() {
        System.out.println("He has been awarded");

    }
}
