package com.aca.Day11;

public class NaturalDivisors {
    public static void main(String[] args) {

    }
    public static void naturalDiv(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
