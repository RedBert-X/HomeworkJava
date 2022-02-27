package com.aca.Day10;

public class BankDeposit {
    public static void main(String[] args) {

    }
    public static void bank(int x, int p, int y) {
        int year = 0;
        for (; x <= y; x += x * p / 100) {
            year++;
        }
        System.out.println(year);
    }
}
