package com.company;

import java.util.ArrayList;
import java.util.Set;

public class AnalyseLines {

    private Set<String> words;

    public AnalyseLines(Set<String> words) {
        this.words = words;
    }

    public int getWordCount(){
        return words.size();
    }

    public String getLongestWord(){
        String longestWord = "";
        int maxLength=0;
        for (String word:words) {
            if(word.length()>maxLength){
                longestWord=word;
                maxLength=word.length();
            }
        }
        return longestWord;
    }

    public String getShortestWord(){
        String shortestWord ="";
        int minLength=Integer.MAX_VALUE;
        for (String word:words) {
            if(word.length()<minLength){
                shortestWord=word;
                minLength=word.length();
            }
        }
        return shortestWord;
    }

    public double getAverageLength(){
        int sum=0;
        for (String word:words) {
            sum+=word.length();
        }
        return ((double) sum)/(words.size());
    }
}
