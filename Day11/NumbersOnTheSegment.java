package com.aca.Day11;

public class NumbersOnTheSegment {
    public static void main(String[] args) {

    }
    public static void numSegment(int a, int b, int c, int d) {
        for (; a <= b; a++) {
            if (a % d == c) {
                System.out.println(a);
            }
        }
    }
}
