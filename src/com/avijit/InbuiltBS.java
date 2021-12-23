package com.avijit;

import java.util.Arrays;

public class InbuiltBS {
    public static void main(String[] args) {
        String[] text = {"wolf", "in","the", "field"};

        int search = Arrays.binarySearch(text, "field");
        System.out.println(search);
    }
}
