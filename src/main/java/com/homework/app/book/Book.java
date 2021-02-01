package com.homework.app.book;

import com.homework.app.book.exeptions.DownloadException;

import org.apache.log4j.Logger;;

public abstract class Book implements Downloadable {
    public static void main(String[] args) {

    }

    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Book.class));

    public String title;
    public Author author;
    public String genre = null;
    public int price=25 ;

    public Book(String book_title, Author book_author, String book_genre) {
        title = book_title;
        author = book_author;
        genre = book_genre;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void print() {
        LOGGER.info("Author: " + author.concatToFullName());
    }

    public void download() throws DownloadException {
        LOGGER.info("Book download!");
    }

    public void buy(int price) {
        LOGGER.info("The price of this book is " + price + "$");
    }

    public void buy() {
     LOGGER.info("The price f this com.homework.app.book is " + price + "$");

    }
}



