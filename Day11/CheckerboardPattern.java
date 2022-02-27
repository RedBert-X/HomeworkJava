package com.aca.Day11;

public class CheckerboardPattern {
    public static void main(String[] args) {
checkPattern(10);
    }
    public static void checkPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
