package com.aca.Day11;

import java.util.Scanner;

public class TenNaturalNumbers {
    public static void main(String[] args) {

    }
    public static void tenNum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Input number " + i);
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Your number sum is " + sum);
    }
}
