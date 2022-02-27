package com.aca.Day11;

public class CountOfNumbers {
    public static void main(String[] args) {

    }
    public static int countNum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
