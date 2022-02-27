package com.aca.Day10;

public class SmallDivisor {
    public static void main(String[] args) {

    }
    public static void smallDiv(int n) {
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        System.out.println(i);
    }
}
