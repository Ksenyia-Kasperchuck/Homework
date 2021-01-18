package book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BooksFormat {
    public static void main(String[] args) throws IOException {
        File file = new File("format.txt");
        file.createNewFile();

        Scanner file_scanner=new Scanner(file);

        while (file_scanner.hasNext()){
            System.out.print(file_scanner.nextLine());
        }

        FileWriter add_format=new FileWriter(file, true);
        add_format.write(", RTF, TXT etc.");
        add_format.close();

        file_scanner.reset();

        while (file_scanner.hasNext()){
            System.out.print(file_scanner.nextLine());
        }
    }
}
