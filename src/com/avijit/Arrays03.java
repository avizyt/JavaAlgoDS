package com.avijit;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] nums1 = new int[3];
        Arrays.fill(nums1, 1);

        int[] nums2 = {0,0,0};
        boolean comparison = Arrays.equals(nums1, nums2);
        System.out.println(comparison);

        int[] nums3 = {1,1,1};
        comparison = Arrays.equals(nums1, nums3);
        System.out.println(comparison);
    }
}
