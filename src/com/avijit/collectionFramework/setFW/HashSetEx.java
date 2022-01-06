package com.avijit.collectionFramework.setFW;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
* Three interfaces used to represent set:
HashSet , TreeSet, LinkedHashSet

* HashSet => will store data without guaranteeing the order of iteration.
* TreeSet => orders a set by value.
* LinkedHashSet => orders a set by arrival time.
 */
public class HashSetEx {
    public static void main(String[] args) {
        String[] arr = new String[] {"3", "25", "2", "79", "2"};

        Set mySet = new HashSet();

        Collections.addAll(mySet, arr);

        System.out.println(mySet);
    }
}
