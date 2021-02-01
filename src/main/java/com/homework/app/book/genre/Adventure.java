package com.homework.app.book.genre;

import com.homework.app.book.Author;
import com.homework.app.book.Book;
import com.homework.app.book.exeptions.DownloadException;

import org.apache.log4j.Logger;;

public class Adventure extends Book {
    private final static Logger LOGGER = Logger.getLogger(Adventure.class);
    public Adventure (String book_title, Author book_author) {
        super (book_title,book_author,"Adventure");
    }

    @Override
    public void download() throws DownloadException {
        LOGGER.info("Downloads of this genre are restricted ");
        throw new DownloadException();
    }

    public void buy(int price){

        LOGGER.info("The price of this com.homework.app.book is "+ (price+5)+"$");
    }
    
}
