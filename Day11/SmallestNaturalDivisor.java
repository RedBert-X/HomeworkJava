package com.aca.Day11;

public class SmallestNaturalDivisor {
    public static void main(String[] args) {

    }
    public static void smallestDivisor(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
