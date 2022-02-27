package com.aca.Day10;

public class NumOfSquares {
    public static void main(String[] args) {

    }
    public static void squareNumber(int a) {
        int i = 1;
        while ((i * i) <= a) {
            System.out.println(i * i);
            i += 1;
        }
    }
}
