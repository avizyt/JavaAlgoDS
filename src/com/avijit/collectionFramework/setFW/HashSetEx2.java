package com.avijit.collectionFramework.setFW;

import java.util.Collections;
import java.util.HashSet;
import  java.util.*;

public class HashSetEx2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {3,25,2,79,2};

        Set mySet = new HashSet();
        Collections.addAll(mySet, arr);

        System.out.println(mySet);
    }
}
