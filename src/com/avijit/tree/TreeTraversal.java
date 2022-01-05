package com.avijit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setLeft(f);
        c.setRight(g);
        PreOrder(a);
        System.out.println("------------------------");
        InOrder(a);
        System.out.println("------------------------");
        PostOrder(a);


    }
    // Pre order
    public static void PreOrder(Node root){
        if(root != null){
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static ArrayList<Integer> preorderTraversal(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            Node tmp = s.pop();
            res.add(tmp.data);

            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.left != null)
                s.push(tmp.left);
        }
        return res;
    }

    // In order traversal
    public static void InOrder(Node root){
        if (root != null){
            InOrder(root.left);
            System.out.println(root.data);
            InOrder(root.right);
        }
    }

    public static ArrayList<Integer> inorderTraversal(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node curNode = root;
        boolean done = false;
        while (!done){
            if (curNode != null){
                s.push(curNode);
                curNode = curNode.left;
            }
            else {
                if(s.isEmpty()){
                    done = true;
            }
                else {
                    curNode = s.pop();
                    res.add(curNode.data);
                    curNode = curNode.right;
                }
            }
        }
        return res;
    }

    public static void PostOrder(Node root){
        if (root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static ArrayList<Integer> postorderTraversal(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        Node prev = null;
        while (!s.isEmpty()){
            Node curr = s.peek();
            if (prev == null || prev.left == curr || prev.right == curr){
                // traverse from top to button, and if curr has left child or right child
                //push into the stack; otherwise , pop out.
                if (curr.left != null)
                    s.push(curr.left);
                else if (curr.right != null)
                    s.push(curr.right);
            }else if (curr.left == prev){
                if (curr.right != null)
                    s.push(curr.right);
            }else {
                res.add(curr.data);
                s.pop();
            }
            prev = curr;
        }
        return res;
    }
}
