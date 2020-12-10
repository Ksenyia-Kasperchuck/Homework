package book.genre;

import book.Author;
import book.Book;

public class Prose extends Book {
    public Prose (String book_title, Author book_author) {
        setTitle(book_title);
        setAuthor(book_author);
        setGenre("book.genre.Prose");
    }
}
