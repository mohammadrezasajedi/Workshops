package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;

public class FileReader {
    private String filePath;
    private Set<String> words;

    public FileReader(String filePath, Set<String> words) {
        this.filePath = filePath;
        this.words = words;
    }

    public void fileToList(){
        try(BufferedReader bufferedReader=new BufferedReader(new java.io.FileReader(this.filePath))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                words.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
