package com.avijit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array04 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3,25,2,79,2};

        Set mySet = new HashSet(Arrays.asList(myArray));

        Set mySet2 = new TreeSet(Arrays.asList(myArray));

        System.out.println(mySet);
        System.out.println(mySet2);
    }
}
