package com.homework.app.book.menu;

import com.homework.app.book.utils.JsonExec;
import com.homework.app.book.Author;
import com.homework.app.book.Library;
import com.homework.app.book.exeptions.DownloadException;
import com.homework.app.book.utils.ReadingFromFile;
import com.homework.app.book.utils.WrittingToFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;;

public class Menu {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Menu.class));

    public void show() throws IOException, DownloadException {

        File dir1 = new File("homework2\\src\\com.homework.app.book\\booksReview");

        System.out.println("======Welcome to the bookstore!======\n\nCheck out the list of available options!");
        System.out.println("Press 1 - add a books to your reading list.\nPress 2 - add a book review.\nPress 3 - download a book.");
        System.out.print("Please make you choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                LOGGER.info("Please write the title of the book you want to read.");
                List<String> reading_list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    String title = scanner.nextLine();
                    reading_list.add(title);
                }

                for (String books_title : reading_list) {
                    System.out.println(books_title);
                }
                break;
            case 2:

                LOGGER.info(ReadingFromFile.read("homework2\\src\\com.homework.app.book\\booksReview\\review_1.txt"));
                BufferedReader add_info = new BufferedReader(new InputStreamReader(System.in));

                String info = add_info.readLine();

                WrittingToFile.write("homework2\\src\\com.homework.app.book\\booksReview\\review_1.txt", info);


                break;
            case 3:
                Library library = new Library();

                ArrayList<String> books = new ArrayList<>();
                books.add("Italy spring");
                books.add("Following summer");
                books.add("Blue cat");
                books.add("Lovely sea");

                library.setBooks(books);

                library.download();

                library = Library.loadFromFile();
                LOGGER.info("Which book do you want to download?");
                LOGGER.info(library.getBooks());

                break;
            case 4:
                JsonExec jsonExec = new JsonExec();

                Author author = new Author("Andrea", "Curora", "Blue Cat");
                String authorJson = jsonExec.convertJavaToJsonStr(author);
                LOGGER.info(authorJson);
                author = jsonExec.convertJsonStrToAuthorPOJO(authorJson);
                LOGGER.info(author.concatToFullName());

                break;
            default:
                String message = "You entered an invalid value!";
                LOGGER.info(message);
                throw new IOException(message);
        }
    }
}

