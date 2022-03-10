package com.aca.Day22.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputNum();
    }

    public static void inputNum () {
        boolean bool = false;
        Scanner sc = new Scanner(System.in);
        while (!bool) {
            try {
                String a = sc.nextLine();
                Integer.parseInt(a);
                System.out.println("Success");
                bool = true;
            } catch (NumberFormatException e) {
                System.out.println("Wrong");
            }
        }
    }

}