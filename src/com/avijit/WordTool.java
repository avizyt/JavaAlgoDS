package com.avijit;


public class WordTool {
    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String text = "The river carried the memories from her childhood.";

        //print the analysis
        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wt.wordCount(text) );
        System.out.println( "Total symbols (w. spaces): " + wt.symbolCount(text, true) );
        System.out.println( "Total symbols (wo. spaces): " + wt.symbolCount(text, false) );

    }
    WordTool() {}

    // A method to count the number of words in a string
    public int wordCount(String s){
        int count = 0;
        if (!(s == null || s.isEmpty())){
            String[] w = s.split("\\s+");
            count = w.length;
        }
        return count;
    }

//    method to count the number of letters in a string,
//    and add the ability to count both with and without
//    whitespace characters.
    public int symbolCount (String s, boolean withSpaces){
        int count = 0;
        if (!(s == null || s.isEmpty())){
            if (withSpaces){
                count = s.length();
            }else {
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }
}
