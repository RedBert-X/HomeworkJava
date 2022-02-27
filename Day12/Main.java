package com.aca.Day12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
    }

    public static int[] inputArr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] randArr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = rand.nextInt(20);
        }
        return arr;
    }

    public static void arrPrint(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //Task 1

    public static void evenIndices(int a) {
        int[] arr = randArr(a);
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task 2

    public static void printElements(int a) {
        int[] arr = randArr(a);
        for (int i = 0; i < a; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task 3

    public static void elementsCount(int a) {
        int count = 0;
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("positive: " + count);
    }

    //Task 4

    public static void prevLarge(int a) {
        int[] arr = inputArr(a);
        for (int i = 1; i < a; i++) {
            if (arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task 5

    public static void signElements(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a - 1; i++) {
            if ((arr[i] > 0 && arr[i + 1] > 0) ||
                    (arr[i] < 0 && arr[i + 1] < 0)) {
                System.out.print(arr[i] + " ");
                System.out.print(arr[i + 1] + "\n");
                break;
            }
        }
    }

    //task 6

    public static void largestElement(int a) {
        int[] arr = inputArr(a);
        int l = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] > arr[l]) {
                l = i;
            }
        }
        System.out.println("Large element: " + arr[l]);
        System.out.println("Index: " + l);
    }

    //Task 7

    public static void smallestElements(int a) {
        int min = Integer.MAX_VALUE;
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            if (min > arr[i] && arr[i] > 0) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    //Task 8

    public static void ElementsCount(int a) {
        int k = 1;
        int[] arr = inputArr(a);
        if (a == 0) {
            System.out.println("Out of array");
            return;
        }
        for (int i = 1; i < a; i++) {
            if (arr[i] > arr[i - 1]) {
                k++;
            }
        }
        System.out.println(k);
    }

    //Task 9

    public static void reverseArray(int a) {
        int[] arr = inputArr(a);
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task 10

    public static void rearrangeArray(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a - i; i++) {
            int k = arr[i];
            arr[i] = arr[a - i - 1];
            arr[a - i - 1] = k;
        }
        arrPrint(arr);
    }

    //Task 11

    public static void reverseAdjElements(int a) {
        int[] arr = inputArr(a);
        for (int i = 1; i < a; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        arrPrint(arr);
    }

    //Task 12

    public static void elementsToRight(int a) {
        int[] arr = inputArr(a);
        int l = arr[a - 1];
        System.arraycopy(arr, 0, arr, 1, a - 1);
        arr[0] = l;
        arrPrint(arr);
    }

    //Task 13

    public static void minMaxIndex(int a) {
        int[] arr = inputArr(a);
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < a; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int swap = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = swap;
        arrPrint(arr);
    }

    //Task 14

    public static void removeIndex(int a, int index) {
        int[] arr = inputArr(a);
        if (a - 1 - index >= 0) System.arraycopy(arr, index + 1, arr, index, a - 1 - index);
        for (int i = 0; i < a - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task 15

    public static void printUnElement(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            boolean k = true;
            for (int j = 0; j < a; j++) {
                if (arr[i] == arr[j] && i != j) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.print(arr[i] + " ");
            }
        }
    }


     //Task 16


    public static void compressArray(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i] == 0 && arr[j] != 0 && j > i) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        arrPrint(arr);
    }
}