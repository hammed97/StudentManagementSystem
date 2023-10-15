package com.studentmgt.student.entities;

import com.studentmgt.student.entities.enums.Gender;
import com.studentmgt.student.enums.BloodGroup;

import com.studentmgt.student.entities.enums.GenoType;

import java.time.LocalDate;

public abstract class User {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", bloodgroup=" + bloodgroup +
                ", genotype=" + genotype +
                '}';
    }

//    public User(String firstName, String lastName, int phoneNumber, LocalDate dateOfBirth, Gender gender, String address, BloodGroup bloodgroup, GenoType genotype) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.dateOfBirth = dateOfBirth;
//        this.gender = gender;
//        this.address = address;
//        this.bloodgroup = bloodgroup;
//        this.genotype = genotype;
//    }

    private int phoneNumber;
    private LocalDate dateOfBirth;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BloodGroup getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(BloodGroup bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public GenoType getGenotype() {
        return genotype;
    }

    public void setGenotype(GenoType genotype) {
        this.genotype = genotype;
    }

    private Gender gender;
    private String address;
    private BloodGroup bloodgroup;
    private GenoType genotype;



}
