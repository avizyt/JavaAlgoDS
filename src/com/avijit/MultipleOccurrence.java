package com.avijit;

import java.util.Arrays;

public class MultipleOccurrence {
    public static void main(String[] args) {
        String[] text = {"So", "many", "books", "so", "little", "time"};
        String target = "so";

        int occurrence = -1;
        for (int i = 0; i<text.length; i++){
            occurrence = text[i].compareToIgnoreCase(target);
            System.out.println(occurrence);
            if (occurrence == 0){

                System.out.println("Found target at: "+i);
            }
        }
    }
}
