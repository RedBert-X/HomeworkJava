package com.aca.Day18;

import static com.aca.Day18.Validator.TriangleValidator.*;

public class Main {
    public static void main(String[] args) {
        //personMain();
        //triangleMain();
        //StoreMain();
    }

    public static void personMain() {
        Person person = new Person();
        person.setFirstName("Albert");
        person.setLastName("Meyrumyan");
        person.setPassportId("AN123456");
        person.setAge(20);
        person.setGender("Male");
        person.setNationality("Armenian");
        System.out.println(person.printPerson());
    }

    public static void triangleMain() {
        Triangle triangle = new Triangle(3, 4, 5);
        if (isValidSide(3)) triangle.setSideA(3);
        if (isValidSide(4)) triangle.setSideB(4);
        if (isValidSide(5)) triangle.setSideC(5);
        if (isTriangleRight(triangle.getSideA(), triangle.getSideB(), triangle.getSideC())) {
            System.out.println(triangle.sumTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        }
        if (isValidTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC())) {
            System.out.println(triangle.sumTriangle(triangle.getSideA(), triangle.getSideB()));
        }
    }

    public static void StoreMain() {
        Store store = new Store();
        store.setName("SuperStore");
        store.setCountOfWorkers(10);
        store.setPhoneNumber("37493366888");
        store.setProducts(new int[]{3, 5, 7, 21, 25});
        System.out.println(store.printStore());
    }
}
