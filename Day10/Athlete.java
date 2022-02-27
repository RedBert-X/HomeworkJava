package com.aca.Day10;

public class Athlete {
    public static void main(String[] args) {

    }
    public static void athlete(double x, double y) {
        int day = 1;
        for (; x < y; x += x * 0.1) {
            day++;
        }
        System.out.println(day);
    }
}
