package com.avijit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterCollection01 {
    public static void main(String[] args) {
        List array = new ArrayList();

        array.add(89);
        array.add(35);
        array.add(57);
        array.add(45);
        array.add(52);

        Iterator iterator = array.iterator();

        while (iterator.hasNext()){
            // point ot next element
            int i = (Integer) iterator.next();

            // print element
            System.out.print(i + " ");
        }
    }
}
