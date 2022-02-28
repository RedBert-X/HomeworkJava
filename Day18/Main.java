package com.aca.Day18;

public class Main {
    public static void main(String[] args) {
    storeCharacteristics();
    }
    public static void personCharacteristics() {
        Person person = new Person();
        person.setFirstName("Albert");
        person.setLastName("Meyrumyan");
        person.setPassportId("AN123456");
        person.setAge(20);
        person.setGender("Male");
        person.setNationality("Armenian");
        person.printPerson();
    }

    public static void storeCharacteristics() {
        Store store = new Store();
        store.setCountOfWorkers(32);
        store.setName("SuperStore");
        store.setPhoneNumber("093366888");
        store.printStore();
    }
}
