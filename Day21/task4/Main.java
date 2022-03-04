package com.aca.Day21.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Square square = new Square();
        String[] arr = {circle.area(), circle.perimeter(), rect.area(), rect.perimeter(), square.area(), square.perimeter()};
        System.out.println(Arrays.toString(arr));
    }
}
