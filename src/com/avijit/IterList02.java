package com.avijit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterList02 {
    public static void main(String[] args) {
        List <Double> arr = new ArrayList<>();

        arr.add(0.5);
        arr.add(2.2);
        arr.add(37.5);
        arr.add(3.2);
        arr.add(1.3);

        System.out.println("Original list: "+ arr);

        ListIterator listIterator = arr.listIterator();

        while (listIterator.hasNext()){
            // point to next element
            double d = (Double) listIterator.next();

            listIterator.set(Math.round(d));
        }
        System.out.println("Modified list: " + arr);
    }
}
