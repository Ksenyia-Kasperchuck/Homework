package book.genre;

import book.Author;
import book.Book;

public class Autobiography extends Book {
    public Autobiography (String book_title, Author book_author) {
        setTitle(book_title);
        setAuthor(book_author);
        setGenre("book.genre.Autobiography");
    }
}
