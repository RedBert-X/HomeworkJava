package com.aca.Day5;


public class Employee {
    // fields id, name, department, age, gender
    int id;
    String name;
    String department;
    int age;
    String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);

    }
}
