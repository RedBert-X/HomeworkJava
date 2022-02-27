package com.aca.Day10;

public class MultipleOfThree {
    public static void main(String[] args) {
    }
    public static void multipleOfThree(int n) {
        int i = 1;
        while (i < n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
