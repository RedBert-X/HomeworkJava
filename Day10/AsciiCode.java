package com.aca.Day10;

public class AsciiCode {
    public static void main(String[] args) {

    }
    public static void asciiCode() {
        int n = 32;
        while (n <= 122) {
            int k = 0;
            while (k < 10) {
                System.out.print((char) n + " ");
                n++;
                k++;
            }
            System.out.println();
        }
    }
}
