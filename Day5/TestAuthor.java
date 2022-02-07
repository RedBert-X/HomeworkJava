package com.aca.Day5;

public class TestAuthor {
    public static void main(String[] args) {
        Author esenin = new Author("Esenin", "eseninthebest@gmail.com", "male");
        esenin.print();
        Book bereza = new Book("bereza", 100, esenin);
        bereza.print();
    }
}
