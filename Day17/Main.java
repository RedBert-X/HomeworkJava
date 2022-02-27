package com.aca.Day17;

import java.util.Arrays;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

    }
    //Task 1
    public static void add(int a, int b) {
        System.out.println("int a, int b");
    }
    public static void add(float a, double b) {
        System.out.println("float a, double b");
    }
    public static void add(long a, String b) {
        System.out.println("long a, String b");
    }
    //Task 2 & 3
    public static int twoMethods(int a) {
        return a;
    }
    public static float twoMethods(float a) {
        return a;
    }
    //Task 4
    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static void print(float[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static void print(double[] a) {
        System.out.println(Arrays.toString(a));
    }
    //Task 5
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        boolean bool = false;
        if (index == argument) {
            return true;
        } else {
            return false;
        }
    }

    //Task 6
    public static double square(int r) {
        return PI * r * r;
    }

    public static int square(int a, int b) {
        return a * b;
    }

    public static double square(float a) {
        return a * a;
    }

    //Task 7
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    //Task 9
    public static void fahrenheitCelsius(float celsius, int choice){
        if (choice==1){
            System.out.println((int)celsius+ " celsius is "+ (int) ((celsius*5/9)+32)+" fahrenheit");
        }
        else{
            System.out.println(((double) celsius+ " celsius is "+ (double) ((celsius*5/9)+32)+" fahrenheit"));
        }
    }
    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        if (choice == 1) {
            System.out.println((int) fahrenheit + " fahrenheit is " + (int) ((fahrenheit - 32) * 5 / 9) + " celsius");

        } else {
            System.out.println(((double) fahrenheit + " fahrenheit is " + (double) ((fahrenheit - 32) * 5 / 9) + " celsius"));
        }
    }
}