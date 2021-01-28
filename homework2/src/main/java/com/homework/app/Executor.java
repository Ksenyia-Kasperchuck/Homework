import main.java.ksenia.app.book.*;
import main.java.ksenia.app.book.exeptions.DownloadException;
import main.java.ksenia.app.book.utils.ReadingFromFile;
import main.java.ksenia.app.book.utils.WrittingToFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Executor {
    public static void main(String[] args) throws IOException, DownloadException {

        File dir1=new File("homework2\\src\\main.java.ksenia.app.book\\booksReview");

        System.out.println("======Welcome to the bookstore!======\n\nCheck out the list of available options!");
        System.out.println("Press 1 - add a books to your reading list.\nPress 2 - add a main.java.ksenia.app.book review.\nPress 3 -download a main.java.ksenia.app.book.");
        System.out.print("Please make you choice: ");

         Scanner scanner=new Scanner(System.in);

         int choice= scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please write the title of the main.java.ksenia.app.book you want to read.");
                List<String> reading_list=new ArrayList<>();
                for(int i=0;i<3;i++) {
                    String title = scanner.nextLine();
                    reading_list.add(title);
                }

                for(String books_title : reading_list){
                    System.out.println(books_title);
                }
                break;
            case 2:

                System.out.println(ReadingFromFile.read("homework2\\src\\main.java.ksenia.app.book\\booksReview\\review_1.txt"));
                BufferedReader add_info=new BufferedReader(new InputStreamReader(System.in));

                String info=add_info.readLine();

                WrittingToFile.write("homework2\\src\\main.java.ksenia.app.book\\booksReview\\review_1.txt", info);


                break;
            case 3:
               Library download_book=new Library();
               download_book.download();
                System.out.println("Which main.java.ksenia.app.book do you want to download?");
               break;
            default:
                throw new IOException("You entered an invalid value!");
        }
    }
}
