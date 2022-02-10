package com.aca.Day8;

import java.util.Scanner;

public class FiveMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your number");
        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.println("Your number is multiple of five");
        } else {
            System.out.println("Your number isn't multiple of five");
        }
    }
}
