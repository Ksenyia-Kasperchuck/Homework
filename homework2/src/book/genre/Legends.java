package book.genre;

import book.Author;
import book.Book;

public class Legends extends Book {
    public Legends (String book_title, Author book_author) {
        setTitle(book_title);
        setAuthor(book_author);
        setGenre("Legendsgit i");
    }
}
