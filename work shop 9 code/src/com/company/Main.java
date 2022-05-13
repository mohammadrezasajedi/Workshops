package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<String> words= Collections.synchronizedSet(new HashSet<String>());

    public static void main(String[] args) {
        //String commonPath=".\\assets\\file_";
        String commonPath="C:\\Users\\sajedi\\Downloads\\work shop 9 code\\src\\com\\company\\assets\\file_";
        for (int i = 1; i <=20 ; i++) {
            String path=commonPath + i + ".txt";
            ReaderThread readerThread=new ReaderThread(words,path);
            readerThread.start();
        }

        System.out.println("The files are read");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        AnalyseLines analyseLines=new AnalyseLines(words);
        System.out.println("Words count: " + analyseLines.getWordCount());
        System.out.println("Longest word: " + analyseLines.getLongestWord() +", length: "+ analyseLines.getLongestWord().length());
        System.out.println("Shortest word: " + analyseLines.getShortestWord() +", length: "+ analyseLines.getShortestWord().length());
        System.out.println("Average words length: " + analyseLines.getAverageLength());

    }
}
