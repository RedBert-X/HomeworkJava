package com.aca.Day18;
import com.aca.Day18.Validator.TriangleValidator;


public class Triangle extends TriangleValidator {

    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int sumTriangle(int sideA, int sideB, int sideC) {
        int trianglePerimeter = 0;
        if (!isValidTriangle(sideA, sideB, sideC)) {
            return trianglePerimeter;
        }
        trianglePerimeter = getSideA() + getSideB() + getSideC();
        return trianglePerimeter;
    }

    public int sumTriangle(int sideA, int sideB) {
        int area = 0;
        if (!isTriangleRight(sideA, sideB, sideC)) {
            return area;
        }
        area = getSideA() * getSideB() * 2;
        return area;
    }
}