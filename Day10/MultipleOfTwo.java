package com.aca.Day10;

public class MultipleOfTwo {
    public static void main(String[] args) {

    }
    public static void multiTwo(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }
}
