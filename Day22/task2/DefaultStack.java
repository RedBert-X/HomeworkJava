package com.aca.Day22.task2;

public class DefaultStack implements Stack{
    private final int[] nums;
    private int index;
    private final static int MAX_SIZE = 5;

    public DefaultStack() {
        nums=new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {
        if (index==MAX_SIZE){
            throw new StackIndexOutOfBoundsException("Out of bound");
        }

    }

    @Override
    public int pop() {
        index--;
        if (index<0){
            throw new EmptyStackException("Empty string");
        }
        return nums[index];
    }
}
