package com.avijit.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b;
        a.right = c;
        a.left.left = d;
        a.left.right = e;
        a.right.left = f;
        a.right.right = g;
        d.setLeft(h);

//        System.out.println(maxInBTree(a));
//        System.out.println(maxInBTLevelOrder(a));
//        insertInBTLevelOrder(a, 8);
//        System.out.println(sizeIter(a));
        levelOrderTraversalReverser(a);

    }
    public static int maxInBTree(Node root){
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = maxInBTree(root.left);
            int rightMax = maxInBTree(root.right);

            if (leftMax > rightMax)
                maxValue = leftMax;
            else
                maxValue = rightMax;
            if(root.data > maxValue)
                maxValue = root.data;
        }
        return maxValue;
    }

    public static boolean findInBT(Node root, int data){
        if(root == null)
            return false;
        if(root.getData() == data)
            return true;
        return findInBT(root.getLeft(), data) || findInBT(root.getRight(), data);
    }

    public static int maxInBTLevelOrder(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        LinkedList<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node tmp = q.poll();
            if(tmp.getData() > max){
                max = tmp.getData();
                System.out.println("=> "+max);
            }
            if (tmp != null){
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if(tmp.right != null)
                    q.offer(tmp.right);
            }
        }
        return max;
    }

    public static Node insertInBTLevelOrder(Node root, int data){
        if (root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node tmp = q.poll();
            if (tmp != null) {
                if (tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                else {
                    tmp.left = new Node(data);
                    return root;
                }

                if (tmp.right != null)
                    q.offer(tmp.right);
                else {
                    tmp.right = new Node(data);
                    return root;
                }
            }
        }
        return root;
    }
    // count the total number of the nodes in Binary tree
    public static int size(Node root){
        int leftCount = root.left == null ? 0: size(root.left);
        int rightCount = root.right == null ? 0: size(root.right);
        return 1 + leftCount + rightCount;
    }

    // count the total number of nodes in the Binary tree no recursive

    public static int sizeIter(Node root){
        int count = 0;
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node tmp = q.poll();
            count++;
            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if(tmp.right != null)
                q.offer(tmp.right);
        }
        return count;
    }

    public static void levelOrderTraversalReverser(Node root){
        if (root == null)
            return;
        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node tmp = q.poll();
            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if (tmp.right != null)
                q.offer(tmp.right);
            s.push(tmp);
        }
        while (!s.isEmpty()){
            System.out.println(s.pop().getData() + " ");
        }
    }

    public static int maxDepthRecursive(Node root){
        if (root == null)
            return 0;
        // Compute the depth of each subtree
        int leftDepth = maxDepthRecursive(root.left);
        int rightDepth = maxDepthRecursive(root.right);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

}
