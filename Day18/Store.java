package com.aca.Day18;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] products;


    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public void printStore() {

        if (countOfWorkers < 3 || countOfWorkers > 50) {
            System.out.println("Incorrect count of workers");
        } else {
            System.out.println("Count of workers: " + countOfWorkers);
        }



        if (name.length() < 3) {
            System.out.println("Incorrect name");
        } else {
            System.out.println("Name: " + name);
        }


        if (phoneNumber.length() < 8 && Integer.parseInt(phoneNumber) < 0) {
            System.out.println("Incorrect phone number");
        } else {
            System.out.println("Phone number: " + phoneNumber);
        }
        System.out.println("Products: Smartphones");
    }
}
