package com.avijit.stack;

import java.util.LinkedList;

public class LinkedStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        int num = 10;
        for (int i = 1; i <= num ; i++) {
            stack.push(i);
        }
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.get(3));

    }
}
