package main.java.com.homework.app.book.genre;

import main.java.com.homework.app.book.Author;
import main.java.com.homework.app.book.Book;
import main.java.com.homework.app.book.exeptions.DownloadException;

public class Adventure extends Book {
    public Adventure (String book_title, Author book_author) {
        super (book_title,book_author,"Adventure");
    }

    @Override
    public void download() throws DownloadException {
        System.out.println("Downloads of this genre are restricted ");
        throw new DownloadException();
    }

    public void buy(int price){

        System.out.println("The price of this main.java.com.homework.app.book is "+ (price+5)+"$");
    }
    
}

