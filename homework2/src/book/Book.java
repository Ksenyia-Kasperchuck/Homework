package book;

public class Book {

    private String title;
    private Author author;
    private String genre;

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

    public void print(){
        System.out.println("Author: "+author.getFullName());
    }
}

