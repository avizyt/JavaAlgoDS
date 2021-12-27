package com.avijit.queue;

import com.avijit.stack.FixedSizeArrayStack;

public class FixedSizeArrayQueue {
    public static void main(String[] args) {

        int num = 10;
        FixedSizeArrayQueue qu = new FixedSizeArrayQueue();
        qu.enQueue(1);
        qu.enQueue(2);
        qu.enQueue(3);
        qu.enQueue(4);
        qu.enQueue(5);
        System.out.println(qu.size());
        System.out.println(qu);
        qu.deQueue();
        qu.deQueue();
        System.out.println(qu);

    }
    private int[] queueRep;
    private int size, front, rear;

    //length of the array used ot implement the queue
    private static final int CAPACITY = 16;

    public FixedSizeArrayQueue(){
        queueRep = new int[CAPACITY];
        size = 0; front=0; rear= 0;
    }

    public FixedSizeArrayQueue(int cap){
        queueRep = new int[cap];
        size=0; front=0; rear=0;
    }
    public void enQueue(int data) throws NullPointerException, IllegalStateException{
        if(size ==CAPACITY)
            throw new IllegalStateException("Queue is full: Overflow");
        else {
            size++;
            queueRep[rear] = data;
            rear = (rear+1)% CAPACITY;
        }
    }

    // remove the front element fro the queue
    public int deQueue() throws IllegalStateException{
        // Effect: if queue is empty throw IllegalState Exception,
        // else remove and return oldest element of this
        if(size==0)
            throw new IllegalStateException("Queue is empty: UnderFlow");
        else {
            size--;
            int data = queueRep[(front% CAPACITY)];
            queueRep[front] = Integer.MIN_VALUE;
            front = (front+1) % CAPACITY;
            return data ;
        }
    }

    // check wheter the queue is empty
    public boolean isEmpty(){
        return (size==0);
    }
    public boolean isFull(){
        return (size== CAPACITY);
    }
    // return the number of element in the queue
    public int size(){
        return size;
    }

    // string repr of queue
    public String toString(){
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += Integer.toString(queueRep[(front + 1) % CAPACITY]);
            if (i < size-1){
                result += ",";
            }

        }
        result += "]";
        return result;
    }
}
