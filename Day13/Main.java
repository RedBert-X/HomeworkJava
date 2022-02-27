package com.aca.Day13;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void printMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] genArr(int n, int m) {
        Random random = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        return array;
    }

    public static void inputArray(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] inputFreeMatrix(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                mat[i][j] = sc.nextInt();
        }
        return mat;
    }

   //Task 1
    public static void matrixDiagonalOne(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                }
            }
        }
        printMatrix(array);

    }

    //Task 2
    public static void diagMatrix(int size) {
        boolean k;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            k = false;
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                    k = true;
                } else if (k) {
                    array[i][j] = 2;
                }
            }
        }
        printMatrix(array);
    }

    //Task 3
    public static boolean checkForSymmetric(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //Task 4
    public static void highestScore(int a, int b) {
        int[][] mat = inputFreeMatrix(a, b);
        int temp;
        int score = 0;
        int line = 0;
        for (int i = 0; i < a; i++) {
            temp = 0;
            for (int j = 0; j < b; j++) {
                temp += mat[i][j];
            }
            if (temp > score) {
                score = temp;
                line = i;
            }
        }
        System.out.println("Max is " + score + " Line is " + line);
    }

    //Task 5
    public static void maxMatrixElem(int n, int m) {
        int[][] array = genArr(n, m);
        printMatrix(array);
        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        System.out.println(max + "   " + row + "   " + col);
    }

    //Task 6
    public static void highRow(int a, int b) {
        int[][] matrix = inputFreeMatrix(a, b);
        int max = 0;
        int num = 0;
        int sum = 0;
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    num = sum;
                }
                if (matrix[i][j] == max) {
                    if (sum > num) {
                        row = i;
                    }
                }
            }
            sum = 0;
        }
        System.out.println("The row is: " + row);
    }

    //Task 7 (does not exist in homework)

    //Task 8
    public static void sumOfArray(int n) {
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        System.out.println("Input first array");
        inputArray(arr1);
        System.out.println("Input second array");
        inputArray(arr2);
        System.out.println("The Result");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
