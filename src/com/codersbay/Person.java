package com.codersbay;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Address address;
    private Gender gender;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender.toString();
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, Address address, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = Gender.valueOf(gender);
    }
}
