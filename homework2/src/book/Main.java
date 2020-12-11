package book;

import book.genre.Adventure;

public class Main {

    public static void main(String[] args) {
        Author danielDefo = new Author("Даниель", "Дефо");
        Book robinsonCrusoe = new Adventure("Robinson Crusoe", danielDefo);
        robinsonCrusoe.print();
    }
}
