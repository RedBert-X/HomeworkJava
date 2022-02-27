package com.aca.Day9;

public class Calculator {
    public static void main(String[] args) {

    }
    public static void calc(double a, double b, char str) {
        switch (str) {
            case '+' -> System.out.println(a + "+" + b + ":" + (a + b));
            case '-' -> System.out.println(a + "-" + b + ":" + (a - b));
            case '*' -> System.out.println(a + "*" + b + ":" + (a * b));
            case '/' -> System.out.println(a + "/" + b + ":" + (a / b));
            default -> System.out.println("Error");
        }
    }
}
