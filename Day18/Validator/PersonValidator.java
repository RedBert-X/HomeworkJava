package com.aca.Day18.Validator;

public class PersonValidator {

    public static void validatorFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("First Name: " + firstName);
        }
    }
    public static void validatorLastName(String lastName) {
        if (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("Last Name: " + lastName);
        }
    }
    public static void validatorPassportID(String passportId){
            if (!(passportId.substring(0, 2).toUpperCase().matches("AN"))) {
                System.out.println("Invalid passport ID");
            } else {
                System.out.println("Passport ID: " + passportId);
            }
        }

    public static void validatorAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("Age out of range");
        } else {
            System.out.println("Age: " + age);
        }
    }
    public static void validatorGender(String gender) {
        if (!(gender.equals("Male") || gender.equals("Female"))) {
            System.out.println("Incorrect gender");
        } else {
            System.out.println("Gender: " + gender);
        }
    }
    public static void validatorNationality(String nationality) {
        System.out.println("Nationality: " + nationality);
    }
}
