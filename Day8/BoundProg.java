package com.aca.Day8;

import java.util.Random;

public class BoundProg {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(5) + 2;
        System.out.println(number);
    }
}
