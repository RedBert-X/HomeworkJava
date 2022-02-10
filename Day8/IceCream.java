package com.aca.Day8;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int k = sc.nextInt();
        if (k==7 || k==1 || k==4 || k==2) {
            System.out.println("Calculation fail");
        } else {
            System.out.println("Calculation succes");
        }


    }
}
