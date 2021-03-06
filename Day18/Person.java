package com.aca.Day18;

import com.aca.Day18.Validator.PersonValidator;

public class Person extends PersonValidator {
    private int age;
    private String firstName;
    private String lastName;
    private String passportId;
    private String gender;
    private String nationality;

    public Person(){

    }
    public Person(int age, String firstName,String lastName,String passportId,String
            gender,String nationality) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
        this.nationality = nationality;
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

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String printPerson() {
        return "Name: " + getFirstName() + "\nLast name: " + getLastName() + "\nPassport ID: " + getPassportId()
                + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nNationality: " + getNationality();
    }
}