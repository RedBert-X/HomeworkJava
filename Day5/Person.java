package com.aca.Day5;

public class Person {

        String name;
        int age;
        String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
    }

}
