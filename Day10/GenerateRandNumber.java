package com.aca.Day10;

import java.util.Scanner;

public class GenerateRandNumber {
    public static void main(String[] args) {

    }
    public  static void NumberGen(int n){
        Scanner scanner=new Scanner(System.in);
        int inp;
        do {
            System.out.println("What the number?");
            inp= scanner.nextInt();
            if(inp>n){
                System.out.println("Too high, try again.");
            }else {
                System.out.println("Too low, try again.");
            }
        }while (inp!=n);
        System.out.println("Yes, you guessed the number");
    }
}
