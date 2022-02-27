package com.aca.Day9;

public class EvenOdd {
    public static void main(String[] args) {

    }
    public static void evenOdd(int n) {
        n %= 2;
        switch (n) {
            case 0 -> System.out.println("Number is even");
            case 1 -> System.out.println("Number is odd");
            default -> System.out.println("Error");
        }
    }
}