package com.aca.Day18.Validator;

public class TriangleValidator {

    public static boolean isValidSide(int side) {
        if (side > 1) {
            if (side < 20) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC) {
            if (sideA + sideC > sideB) {
                return sideB + sideC > sideA;
            }
        }
        return false;
    }

    public static boolean isTriangleRight(int sideA, int sideB, int sideC) {
        if (sideA * sideA + sideB * sideB == sideC * sideC) {
            return true;
        }
        if (sideA * sideA + sideC * sideC == sideB * sideB) {
            return true;
        }
        if (sideB * sideB + sideC * sideC == sideA * sideA) {
            return true;
        }
        return false;
    }
}