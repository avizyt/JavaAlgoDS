package com.avijit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        a.left.left = d;
        a.left.right = e;
        a.right.left = f;
        a.right.right = g;

        InOrder(a);
        System.out.println("--------------------------------");
        System.out.println(InOrderIter(a));
    }

    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static void InOrder(Node root){
        if (root != null){
            InOrder(root.left);
            System.out.println(root.data);
            InOrder(root.right);

        }
    }

    static ArrayList<Integer> InOrderIter(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stk = new Stack<>();
        Node curNode = root;
        boolean done = false;
        while (!done){
            if(curNode != null){
                stk.push(curNode);
            curNode = curNode.left;
        }
        else {
            if(stk.isEmpty())
                done = true;
            else {
                curNode = stk.pop();
                res.add(curNode.data);
                curNode = curNode.right;
            }
        }
        }
        return res;

    }
}
