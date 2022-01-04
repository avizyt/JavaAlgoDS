package com.avijit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
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

        preOrder(a);
        System.out.println(preOrderIter(a));


    }


    static class Node{
        int data;
        Node left, right;
        Node(int data){

            this.data = data;
            left = null;
            right = null;
    }
    }
    static void preOrder(Node root){
        if(root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
    }
    }
    static ArrayList<Integer> preOrderIter(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while (!stk.isEmpty()){
            Node tmp = stk.pop();
            res.add(tmp.data);

            if(tmp.left != null)
                stk.push(tmp.left);
            if(tmp.right != null)
                stk.push(tmp.right);
        }
        return res;

    }
}

