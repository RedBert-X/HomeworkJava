package com.aca.Day8;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Write your number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number isn't even!");
        }
    }
}
