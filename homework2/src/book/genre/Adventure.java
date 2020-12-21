package book.genre;

import book.Author;
import book.Book;

public class Adventure extends Book {
    public Adventure (String book_title, Author book_author) {
        super (book_title,book_author,"Adventure");
    }

    @Override
    public void download() {
        System.out.println("Downloads of this genre are restricted ");
    }

    public void buy(int price){
        System.out.println("The price of this book is "+ (price+5)+"$");
    }
}

