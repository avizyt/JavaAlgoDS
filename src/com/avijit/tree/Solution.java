package com.avijit.tree;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

    }
    public int maxInBTree(BinaryTreeNode root){
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

    public static boolean findInBT(BinaryTreeNode root, int data){
        if(root == null)
            return false;
        if(root.getData() == data)
            return true;
        return findInBT(root.getLeft(), data) || findInBT(root.getRight(), data);
    }

    public int maxInBTLevelOrder(BinaryTreeNode root){
        if(root == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        LinkedList<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getData() > max){
                max = tmp.getData();
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

}
