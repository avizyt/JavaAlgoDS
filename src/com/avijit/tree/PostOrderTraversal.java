package com.avijit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
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

        PostOrder(a);
        System.out.println("--------------------------------");
        System.out.println(postOrderIter(a));
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

    static void PostOrder(Node root){
        if (root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.data);
        }
    }
    static ArrayList<Integer> postOrderIter(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        Node prev = null;
        while (!s.isEmpty()){
            Node cur = s.peek();
            if (prev == null || prev.left == cur || prev.right == cur){
                if(cur.left != null)
                    s.push(cur.left);
                else if(cur.right != null)
                    s.push(cur.right);
            }else if(cur.left == prev){
                if(cur.right != null)
                    s.push(cur.right);
            }else {
                res.add(cur.data);
                s.pop();
            }
            prev = cur;
        }
        return res;
    }
}
