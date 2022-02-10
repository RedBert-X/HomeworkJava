package com.aca.Day8;

import java.util.Random;
import java.util.Scanner;

public class RandBound {
    public static void main(String[] args) {
        Random rand = new Random();

        int random = rand.nextInt(-1000, 1000);
        System.out.println(random);
        if (random % 3 == 0 && random % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
