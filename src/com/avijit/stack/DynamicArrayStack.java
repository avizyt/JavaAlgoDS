package com.avijit.stack;


public class DynamicArrayStack {
    public static void main(String[] args) throws Exception {

        DynamicArrayStack dstack = new DynamicArrayStack();
        int num = 24;
        for (int i = 10; i <= num; i++) {
            dstack.push(i);
        }
        System.out.println("size: "+ dstack.size());
        System.out.println(" Stack: "+ dstack.toString());

    }
    // length of the array used to implement the stack.
    protected int capacity;
    // default array capacity.
    public static final int CAPACITY = 16; // power of 2
    public static int MINCAPACITY = 1<<15; // power of 2
    // array used to implement the stack
    protected int[] stackRep;
    // index of the top element of the stack
    protected int top = -1;

    // initializes the stack to use an array of default size.
    public DynamicArrayStack(){
        this(CAPACITY);
    }

    // initializes the stack to use an array of given size
    public DynamicArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }
    // return the number of element in stack
    public int size(){
        return (top + 1);
    }
    // check empty
    public boolean isEmpty() {
        return (top<0);
    }
    // insert an element in to the stack
    public void push(int data) throws Exception{
        if (size() == capacity)
            expand();
        stackRep[++top] = data;
    }
    public void expand(){
        int length = size();
        int[] newstack= new int[length<<1];
        System.arraycopy(stackRep,0,newstack,0, length);
        stackRep=newstack;
        this.capacity = this.capacity<<1;
    }
    // dynamic array operation: shrink to 1/2 if more than 3/4 empty
    public void shrink(){
        int length = top+1;
        if(length<= MINCAPACITY || top<<2 >= length)
            return;
        length = length+ (top<<1);
        if(top<MINCAPACITY) length = MINCAPACITY;
        int[] newstack= new int[length];
        System.arraycopy(stackRep,0, newstack, 0, top+1);
        stackRep=newstack;
        this.capacity = length;
    }

    // inspect the element at the top of the stack
    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty.");
        return stackRep[top];
    }
    //remove the top element
    public int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("Stack is empty.");
        data =stackRep[top];
        stackRep[top--]= Integer.MIN_VALUE; // dereference the top for garbej collection.
        shrink();
        return data;
    }

    // representation of stack
    public String toString(){
        String s;
        s = "[";
        if (size()>0)
            s += stackRep[0];
        if (size()>1)
            for (int i = 1; i <= size()+1; i++) {
                s += "," + stackRep[i];
            }
        return s+"]";
    }
}
