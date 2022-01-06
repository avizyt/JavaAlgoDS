package com.avijit.stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full.");
            return true;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackExceptions {
        if (isEmpty()){
            throw new StackExceptions("Cannot pop from empty stack.");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackExceptions {
        if (isEmpty()){
            throw new StackExceptions("Cannot peek from am empty stack.");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
