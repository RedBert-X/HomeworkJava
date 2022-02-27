package com.aca.Day11;

public class ExactSquares {
    public static void main(String[] args) {

    }
    public static void exSquares(int a, int b) {
        for (; a <= b; a++) {
            if (Math.sqrt(a) == (int) Math.sqrt(a)) {
                System.out.println(a);
            }
        }
    }
}
