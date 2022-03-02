package com.aca.Day18;
import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int[] products;


    public Store() {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.products = products;
    }

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

    String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getProducts() {
        return products;
    }

    public void setProducts(int[] products) {
        this.products = products;
    }

    public String printStore() {
        return ("Name: " + getName() + "\nCount of workers: " + getCountOfWorkers() + "\nPhone number: " +
                getPhoneNumber() + "\nProducts: " + Arrays.toString(getProducts()));
    }
}