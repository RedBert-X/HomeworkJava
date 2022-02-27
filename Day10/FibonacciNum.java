package com.aca.Day10;

public class FibonacciNum {
    public static void main(String[] args) {

    }
    public static int fib(int n) {
        int j;
        int index=1;
        for (int i = 1, k = 0; i <= n; j = i, i += k, k = j) {
            if (i == n) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
