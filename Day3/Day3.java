package com.aca.Day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        /*
        String str1 = "he";
        String str2 = "llo";

        String res = str1 + str2;
        System.out.println(res);
         */

     //   System.out.println(charInt(sc.next().charAt(0)));

        //temp(input);

        //castingUp(input);

        //castingDown(input);

        //temperature(input);

        //NameAndDate();

        //System.out.println(NameLetters());

    }
    /**
     * 1. Casting Down
     */
  /*
    public static void castingUp(byte b) {
        short s = b;
        int g = s;
        long k = g;
        float z = k;
        double l = z;
        System.out.println("byte: " + b + ", short: " + s);
    }
    */
    /**
     * 2. Casting Up
     */
    /*
     public static void castingDown(double b){
        float z = (float) b;
        long x = (long) z;
        int h = (int) x;
        short c = (short) h;
        byte j = (byte) c;
        System.out.println("float: " + z + ", double: " + b);
    }
   */

    /**
     * 3. Temperature convertor
     */
/* //Other Version
   public static void temperature(byte celsius) {
        int fahrenheit = celsius + 32;
        System.out.println("Celsius: " + celsius + ", Fahrenheit: " + fahrenheit);
    }
*/
/*
 //Original Version
    public static void temp(double fahr){
        double celsiusDouble = (fahr - 32) / 1.8;
        System.out.println("Celsius(double): " + celsiusDouble);

        float celsiusFloat = (float) celsiusDouble;
        System.out.println("Celsius(float): " + celsiusFloat);

        int celsiusInt = (int)celsiusFloat;
        System.out.println("Celsius(int): " + celsiusInt);
    }
 */

    /**
     * 4. PI
     */
   /*
    public static void PI() {
        double PI = Math.PI;
    }
    */
    /**
     * 6.
     */
    /*
    public static void NameAndDate() {
        char a = 'a';
        char b = 'l';
        char c = 'b';
        char d = 'e';
        char e = 'r';
        char f = 't';

        int birthday = 2002;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(f);

        System.out.println(birthday);
    }
     */
    /**
     * 7.
     */
    /*
    public static int charInt(char ch) {
        return ch;
    }
     */

    /**
     * 8.
     */
    /*
    public static double NameLetters() {
        char a = 'A';
        char b = 'l';
        char c = 'b';
        char d = 'e';
        char e = 'r';
        char f = 't';

        double avg = (a + b + c) / 3d;

        return avg;
    }
     */





}