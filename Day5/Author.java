package com.aca.Day5;

public class Author {
    String name;
    String email;
    String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("gender: " + gender);
    }
}
