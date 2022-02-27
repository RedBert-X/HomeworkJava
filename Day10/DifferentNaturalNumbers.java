package com.aca.Day10;

import java.util.Scanner;

public class DifferentNaturalNumbers {
    public static void main(String[] args) {

    }
    public static void NaturalNumbers(){
        Scanner scanner =new Scanner(System.in);
        int n;
        int max1=0,max2=0;
        do {
            n= scanner.nextInt();
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2 && n!=max1){
                max2=n;
            }
        }while (n!=0);
        System.out.println(max2);
    }
}
