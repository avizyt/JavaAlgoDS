package com.avijit;

import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        int[] num = new int[5];
        Arrays.fill(num, 1);
        System.out.println(Arrays.toString(num));

        int[] shortNum = Arrays.copyOfRange(num, 0,4);
        System.out.println(Arrays.toString(shortNum));

        int[] longnum = Arrays.copyOf(num,10);
        System.out.println(Arrays.toString(longnum));


    }
}
