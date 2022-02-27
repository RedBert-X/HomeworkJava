package com.aca.Day11;

import java.util.Scanner;

public class NumOfZeros {
    public static void main(String[] args) {

    }
    public static void posNegZero(int n) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int pin;
        for (int i = 0; i < n; i++) {
            pin = scanner.nextInt();
            if (pin > 0) {
                positive++;
            } else if (pin == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println("num of zeros " + zero +
                " num of positive " + positive + " " +
                "negative num " + negative);
    }
}
