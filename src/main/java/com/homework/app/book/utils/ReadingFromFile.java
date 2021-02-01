package com.homework.app.book.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static String read(String filePath) throws FileNotFoundException {
        String result = "";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            result = result + scanner.nextLine() + "\n";
        }
        return result;
    }
}
