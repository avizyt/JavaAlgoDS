package com.avijit;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Array06 {
    public static void main(String[] args) {
        Integer[] nums1 = new Integer[] {3,25,2,79,2};
        Integer[] nums2 = new Integer[] {7,12,14,79};

        Set set1 = new HashSet();
        Collections.addAll(set1, nums1);
        Set set2 = new HashSet();
        Collections.addAll(set2, nums2);

        set1.addAll(set2);
        System.out.println(set1);

    }
}
