package com.aca.Day5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emily = new Employee(1, "Emily", "AUA", 18, "female");
        Employee alina = new Employee( 2, "Alina", "EPH", 20, "female");
        Employee zohrab = new Employee(3, "Zohrab", "NPUA", 21, "male");
        Employee grish = new Employee(4, "Grish", "EPH", 18, "male");
        Employee gurgen = new Employee(5, "Gurgen", "EPH", 19, "male");
        emily.print();
        alina.print();
        zohrab.print();
        grish.print();
        gurgen.print();
    }
}
