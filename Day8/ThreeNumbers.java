package com.aca.Day8;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write three numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " - This number is greatest");
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " - This number is greatest");
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " - This number is greatest");
        }
    }
}
