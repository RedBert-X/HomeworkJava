package com.aca.Day5;

public class Book {
    String name;
    int price;
    Author author;

    public Book(String name, int price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void print() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author.name);
    }
}
