package com.aca.Day10;

public class MathPow {
    public static void main(String[] args) {

    }
    public static void mathPow(int n) {
        int sum = 1;
        int i = 0;
        while (sum < n) {
            sum *= 2;
            i++;
        }
        System.out.println(i);
    }
}
