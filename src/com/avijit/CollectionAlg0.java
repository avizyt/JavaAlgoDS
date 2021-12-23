package com.avijit;

import java.util.ArrayList;
import java.util.List;

public class CollectionAlg0 {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.hashCode());
        System.out.println(list.iterator());
//        System.out.println(list.binarySearch(4));

    }
}
