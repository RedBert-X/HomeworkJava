package com.aca.Day8;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int k = sc.nextInt();
        if (k%100!=0 && k%4==0 || k%400==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}