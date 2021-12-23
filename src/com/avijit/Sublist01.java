package com.avijit;

import java.util.ArrayList;
import java.util.List;

public class Sublist01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("No");
        list.add("matter");
        list.add("what");
        list.add("you");
        list.add("do");

        System.out.println(list);

        list.subList(2,4).clear();

        System.out.println(list);
    }
}
