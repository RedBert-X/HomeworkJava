package com.aca.Day8;

import java.util.Random;

public class AwithB {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(-200,200);
        int b = rand.nextInt(-200,200);
        System.out.println("number of a: " + a);
        System.out.println("number of b: " + b);
        System.out.println(" ");
        if (a > 10 && b != 10) {
            System.out.println("legal");
        } else {
            System.out.println("illegal");
        }
        System.out.print(" ");

        if (a > 0 && b > 0) {
            System.out.println("legal");
            }
        System.out.print(" ");

        if (a < 0 && b < 0) {
            System.out.println("legal");
        }
        System.out.print(" ");

        if (a > 10 + b && 10 + b < 1) {
            System.out.println("legal");
        }
        System.out.print(" ");
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("illegal");
        } else {
            System.out.println("legal");
        }
        System.out.print(" ");

        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("legal");
        } else {
            System.out.println("illegal");
        }
        System.out.print(" ");

        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("illegal");
        } else {
            System.out.println("legal");
        }
    }
}
