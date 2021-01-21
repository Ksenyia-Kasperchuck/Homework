package book.utils;

import java.io.*;

public class WrittingToFile {

    public static void write(String fileName,String content) throws IOException {

        FileWriter add=new FileWriter(fileName,true);
        add.write(content);
        add.close();
    }
}
