package com.aca.Day11;

public class ReverseOrder {
    public static void main(String[] args) {

    }
    public static void reverseOrd(int x) {
        int k = 0;
        while (x > 0) {
            if (x % 10 == 0 && k == 0) {
                x /= 10;
                continue;
            }
            System.out.print(x % 10);
            x /= 10;
            k++;
        }
    }
}
