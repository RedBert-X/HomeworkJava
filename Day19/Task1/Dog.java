package com.aca.Day19.Task1;

public class Dog extends Animal{
    @Override
    protected void voice() {
        System.out.println("Dog voice");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eat");
    }
}
