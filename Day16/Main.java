package com.aca.Day16;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static com.aca.Day13.Main.printMatrix;

public class Main {
    public static void main(String[] args) {


    //task 7
//        firstLetter(sc.nextLine());
//        checkerBoard();
//        System.out.println(geometricProgression(2, 2, 5));
//        primeFactors(121);
    }

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // Task 3
    public static void PowerOfN(int n) {
        if (n < 1 || n > 15) {
            System.out.println("Out of range");
        } else {
            System.out.println(Math.pow(2, n));
        }
    }
    //Task 4
    public static void timePass(int n) {
        System.out.println((n / 60) % 24 + " " + n % 60);
    }
    //task 5
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;
        if(inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i<= inputNumber/2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }
    //Task 6
    public static void displayPalindrome(int a, int b) {
        for (int num = a; num <= b; num++) {
            if ((num / 100) == (num % 10) && (num / 100 % 10 == num / 10 %10)) {
                System.out.println(num);
            }
        }
    }
    //task 7
    public static void firstLetter(String let) {
        String let2;
        let2 = let;
        let2 = let.substring(0, 1).toUpperCase() + let.substring(1);
        System.out.println(let2);
    }
    //task 8
    public static void checkerBoard(int a) {
        String[][] board = new String[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                board[i][j] = (i + j) % 2 == 0 ? "X" : "O";
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Task 9
    public static double geometricProgression(int first, int second, int third) {
        for (int i = 0; i < third - 1; i++) {
            first *= second;
        }
        return first;
    }
    //Task 10
    public static void primeFactors(int num) {
        int n = num;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print("*");
                }
            }
        }

        if (n != 1) {
            System.out.print(n);
        }
    }

    //Task 11
    public static int[][] multiplicationTable(int n, int m) {
        int[][] table = new int[n][m];
        int row;
        int col;
        for (int i = m; i < n * m; i++) {
            row = i / m;
            col = i % m;
            table[row][col] = row * col;
        }

        return table;
    }

    //Task 13
    public static void snakeArr(int n, int m) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = i * 10 + j;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = i * 10 + m - 1 - j;
                }
            }
        }
        printMatrix(mat);
    }

}