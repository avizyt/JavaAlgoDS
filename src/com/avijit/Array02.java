package com.avijit;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Arrays.fill(num, 1);
        System.out.println(Arrays.toString(num));

        int[] shortNumbers = Arrays.copyOfRange(num, 0,2);
        System.out.println(Arrays.toString(shortNumbers));

        int[] longNumbers = Arrays.copyOf(num, 10);
        System.out.println(longNumbers);
    }
}
