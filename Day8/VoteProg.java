package com.aca.Day8;

import java.util.Scanner;

public class VoteProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your age.");
        int person = sc.nextInt();
        if (person < 18) {
            System.out.println("You must be over 18 to vote.");
        } else {
            System.out.println("You can vote!");
        }
    }
}
