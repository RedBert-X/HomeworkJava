package com.aca.Day11;

public class MultiplicationTable {
    public static void main(String[] args) {
        // not my code
    }
    public static void multiplicTable(int n) {
        System.out.print(" * |");
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            }
            if (i >= 10 && i < 100) {
                System.out.print("  " + i);
            }
            if (i >= 100 && i < 1000) {
                System.out.print("  " + i);
            }
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |");
            }
            if (i >= 10 && i < 100) {
                System.out.print(i + " |");
            }
            if (i >= 100 && i < 1000) {
                System.out.print(i + "|");
            }
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.print("   " + i * j);
                }
                if (i * j >= 10 && i * j < 100) {
                    System.out.print("  " + i * j);
                }
                if (i * j >= 100 && i * j < 1000) {
                    System.out.print(" " + i * j);
                }
            }
            System.out.println();
        }

    }
}
