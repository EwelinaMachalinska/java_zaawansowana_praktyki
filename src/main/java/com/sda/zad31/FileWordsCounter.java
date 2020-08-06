package com.sda.zad31;

import java.io.*;
import java.util.Scanner;

public class FileWordsCounter {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the path to the file: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        FileReader fileReader = new FileReader(path);
        System.out.println("Number of words: " + numberOFWords(fileReader));
    }
    public static int numberOFWords(FileReader r) {
        Scanner scanner = new Scanner(r);
        int WordCount = 0;
        while (scanner.hasNext()) {
            scanner.next();
            WordCount++;
        }
        scanner.close();
        return WordCount;
    }
}