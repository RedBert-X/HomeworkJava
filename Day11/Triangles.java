package com.aca.Day11;

public class Triangles {
    public static void main(String[] args) {

    }
    public static void variable1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            if(i!=n-1) {
                System.out.println();
            }
        }
    }

    public static void variable2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                System.out.print("*");
            }
            if(i!=n-1) {
                System.out.println();
            }
        }
    }

    public static void variable3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if(i!=n-1) {
                System.out.println();
            }
        }
    }

    public static void variable4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >=n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if(i!=n-1) {
                System.out.println();
            }
        }

    }
}
