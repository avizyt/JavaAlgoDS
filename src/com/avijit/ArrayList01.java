package com.avijit;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(35);
        list.add(43);
        list.add(36);
        list.add(15);
        list.add(5);

        System.out.println(list);

        int index = list.indexOf(15);
        System.out.println("index 15 at: " + index);

        System.out.println("Component: " + list.get(index));

    }
}
