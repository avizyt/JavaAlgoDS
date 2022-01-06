package com.avijit.collectionFramework.setFW;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        Integer[] numb1 = new Integer[] {3,25,2,79,2};
        Integer[] numb2 = new Integer[] {7,12,14,79};

        Set set1 = new TreeSet();
        Collections.addAll(set1, numb1);

        Set set2 = new TreeSet();
        Collections.addAll(set2, numb2);

        set1.addAll(set2);
        System.out.println(set1);
    }
}
