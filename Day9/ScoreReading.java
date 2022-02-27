package com.aca.Day9;

public class ScoreReading {
    public static void scoreRead(int a,int b,int c){
        int score;
        score = ((a+b+c)/3)/20;
        switch (score) {
            case 1 -> System.out.println("Your grade is F.");
            case 2 -> System.out.println("Your grade is C.");
            case 3 -> System.out.println("Your grade is B.");
            case 4 -> System.out.println("Your grade is A.");
            default -> System.out.println("Error");
        }
    }
}
