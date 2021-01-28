package main.java.com.homework.app.book;

import main.java.com.homework.app.book.exeptions.DownloadException;

public abstract class Book implements Downloadable {

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
        System.out.println("Author: " + author.getFullName());
    }

    public void download() throws DownloadException {
        System.out.println("Book downloaded");
    }

    public void buy(int price) {
        System.out.println("The price of this main.java.com.homework.app.book is " + price + "$");
    }

    public void buy() {
        System.out.println("The price f this main.java.com.homework.app.book is " + price + "$");

    }
}



