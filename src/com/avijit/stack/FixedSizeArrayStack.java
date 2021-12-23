package com.avijit.stack;


public class FixedSizeArrayStack {
    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack st = new FixedSizeArrayStack(20);
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
        int nums = 20;
        for (int i = 1; i <= nums ; i++) {
            st.push(i);
        }
        System.out.println("Size of the stack: "+ st.size());
        System.out.println("Stack: "+ st.toString());

//        for (int j = 0; j < st.size(); j++) {
//            st.pop();
//        }
//        System.out.println("Size of the stack after pop: "+ st.size());
//        System.out.println(st.toString());
    }
    // length of the array used to implement the stack
    protected int capacity;
    // default array capacity
    public static final int CAPACITY = 10;

    // array used to implement the stack
    protected int[] stackRep;

    // index of the top element of the stack in the array
    protected int top = -1;

    // initializes the stack to use an array of default length.
    public FixedSizeArrayStack(){
        this(CAPACITY); // default capacity
    }

    // initializes the stack to use an array of given length.
    public FixedSizeArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    // return the number of elements in the stack
    public int size(){
        return (top+1);
    }

    // tests whether the stack is empty
    public boolean isEmpty(){
        return (top < 0);
    }

    //insert an element at the top of the stack
    public void push(int data) throws Exception {
        if (size() == capacity)
            throw new Exception("Stack is full");
        stackRep[++top] = data;
    }

    // inspects teh element at the top of the stack
    public int top() throws Exception{
        if (isEmpty())
            throw new Exception("Stack is empty.");
        return stackRep[top];
    }

    // remove the top element from the stack
    public int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("Stack is empty");
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    // return the string repr of the stack as a list.
    // method time Complexity O(n).
    // n is the size of the stack
    public String toString(){
        String s;
        s = "[";
        if(size() > 0)
            s += stackRep[0];
        if(size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += "," + stackRep[i];
            }
        return s + "]";
    }
}
