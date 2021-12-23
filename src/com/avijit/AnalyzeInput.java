package com.avijit;

import java.io.Console;
import java.util.*;

public class AnalyzeInput {
    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList<>();
        Console cons;
        String line = "";
        while (!line.equals("*")
                && (cons = System.console()) != null
                && (line = cons.readLine()) != null
        ) {
            List <String> lineList = new ArrayList<>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }
        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());

        Set <String> textSet = new HashSet<>();
        textSet.addAll(text);

        Iterator iterator = textSet.iterator();

        while (iterator.hasNext()){
            String s = (String) iterator.next();

            int freq = Collections.frequency(text, s);

            System.out.println(s + " appears"+ freq +" items");
        }
    }
}
