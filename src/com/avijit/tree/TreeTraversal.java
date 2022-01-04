package com.avijit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {

    }
    // Pre order
    public void PreOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);

            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.left != null)
                s.push(tmp.left);
        }
        return res;
    }

    // In order traversal
    public void InOrder(BinaryTreeNode root){
        if (root != null){
            InOrder(root.left);
            System.out.println(root.data);
            InOrder(root.right);
        }
    }

    public ArrayList<Integer> inorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode curNode = root;
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

    public void PostOrder(BinaryTreeNode root){
        if (root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.data);
        }
    }

    public ArrayList<Integer> postorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        BinaryTreeNode prev = null;
        while (!s.isEmpty()){
            BinaryTreeNode curr = s.peek();
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
