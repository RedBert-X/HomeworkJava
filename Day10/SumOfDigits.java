package com.aca.Day10;

public class SumOfDigits {
    public static void main(String[] args) {

    }
    public  static void sumOfDigits(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
