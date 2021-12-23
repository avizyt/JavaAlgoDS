package com.avijit;

import java.util.*;

public class ArrayToSet {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {3,25,2,79,2};

        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arr));

        System.out.println(mySet);
    }
}
