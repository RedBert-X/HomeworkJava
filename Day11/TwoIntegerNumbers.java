package com.aca.Day11;

public class TwoIntegerNumbers {
    public static void main(String[] args) {

    }
    public static int integerNum(int x, int d) {
        if (d > 9 || d < 0) {
            return -1;
        }
        int sum = 0;
        for (; x != 0; x /= 10) {
            if (x % 10 == d) {
                sum++;
            }
        }
        return sum;
    }
}
