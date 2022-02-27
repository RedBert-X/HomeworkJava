package com.aca.Day11;

public class BinaryToDecimal {
    public static void main(String[] args) {

    }
    public static void binToDec(int bin) {
        int sum = 0;
        for (int i = 0; bin > 0; i++) {
            sum += Math.pow(2, i) * (bin % 10);
            bin /= 10;
        }
        System.out.println("Your binary number in digital is " + sum);
    }
}
