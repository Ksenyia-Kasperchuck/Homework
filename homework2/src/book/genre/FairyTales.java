package book.genre;

import book.Author;
import book.Book;

public class FairyTales extends Book {
    public FairyTales (String book_title, Author book_author) {
        setTitle(book_title);
        setAuthor(book_author);
        setGenre("Fairy tales");
    }
}
