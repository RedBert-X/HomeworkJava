package com.aca.Day18.Validator;

public class StoreValidator {

    public static void validatorCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 3 || countOfWorkers > 50) {
            System.out.println("Incorrect count of workers");
        } else {
            System.out.println("Count of workers: " + countOfWorkers);
        }
    }

    public static void validatorName(String name) {
        if (name.length() < 3) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("Name: " + name);
        }
    }

    public static void validatorPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 8 && Integer.parseInt(phoneNumber) < 0) {
            System.out.println("Incorrect phone number");
        } else {
            System.out.println("Phone number: " + phoneNumber);
        }
    }
}
