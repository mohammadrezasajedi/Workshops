package com.company;

import java.util.Set;

public class ReaderThread extends Thread{
    private Set<String> words;
    private String path;

    public ReaderThread(Set<String> words, String path) {
        this.words = words;
        this.path=path;
    }

    @Override
    public void run() {
        FileReader fileReader=new FileReader(path,words);
        fileReader.fileToList();
    }
}
