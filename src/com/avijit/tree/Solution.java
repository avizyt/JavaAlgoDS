package com.avijit.tree;

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

}
