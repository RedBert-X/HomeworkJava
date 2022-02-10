package com.aca.Day8;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int numberday = sc.nextInt();
        if (numberday == 7) {
            System.out.println("7. Sunday");
        } else if (numberday == 1){
            System.out.println("1. Monday");
        } else if (numberday == 2) {
            System.out.println("2. Tuesday");
        } else if (numberday == 3){
            System.out.println("3. Wednesday");
        } else if (numberday == 4) {
            System.out.println("4. Thursday");
        } else if (numberday == 5) {
            System.out.println("5. Friday");
        } else if (numberday == 6) {
            System.out.println("6. Saturday");
        } else {
            System.out.println("This number is not weekday");
        }
    }
}
