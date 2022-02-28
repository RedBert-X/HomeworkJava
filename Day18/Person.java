package com.aca.Day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;


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

    public void printPerson() {
        if (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("First Name: " + firstName);
        }

        if (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("Last Name: " + lastName);
        }


        if (!(passportId.substring(0, 2).toUpperCase().matches("AN"))) {
            System.out.println("Invalid passport ID");
        } else  {
            System.out.println("Passport ID: " + passportId);
        }


        if (age < 18 || age > 99) {
            System.out.println("Age out of range");
        }else {
            System.out.println("Age: " + age);
        }


        if (!(gender.equals("Male") || gender.equals("Female"))) {
            System.out.println("Incorrect gender");
        } else {
            System.out.println("Gender: " + gender);
        }


        System.out.println("Nationality: " + nationality);
    }
}
