package com.avijit.stack;

import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {
        String s1 = "()(({[()]}))";
        String s2 = "()(({[()]))";
        System.out.println("Checking s1: " + isValidSymbolPattern(s1));
        System.out.println("Checking s2: " + isValidSymbolPattern(s2));

    }
    public static boolean isValidSymbolPattern(String s){
        Stack<Character> stk = new Stack<>();
        if (s==null || s.length() == 0)
            return true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==')'){
                if (!stk.isEmpty() && stk.peek()=='(')
                    stk.pop();
                else
                    return false;
            }
            else if (s.charAt(i) == ']'){
                if(!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }else if (s.charAt(i) == '}'){
                if(!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            }else {
                stk.push(s.charAt(i));
            }
        }
        return stk.isEmpty();
    }
}
