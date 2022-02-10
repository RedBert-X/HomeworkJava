package com.aca.Day8;

import java.util.Scanner;

public class AvsB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write numbers to find out odd or even values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 7 == 0 || b % 7 == 0) {
            if (a > 0 && b > 0 && a > b) {
                if (a % 2 != 0 && b % 2 != 0) {
                    System.out.println("A and B have odd value");
                } else {
                    System.out.println("A and B haven't odd value");
                }
            } else {
                System.out.println("This number is invalid");
            }
        } else {
            if (a % 2 ==0 && b % 2 == 0) {
                System.out.println("A and B have even value");
            } else {
                System.out.println("A and B haven't even value");
            }
        }
    }
}
