package com.aca.Day11;

public class Gnche {
    public static void main(String[] args) {

    }

    public static void gnche_1(int n) {
        int sum = 0;
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                sum++;
                if (sum == n) {
                    return;
                }
            }
        }
    }
}
