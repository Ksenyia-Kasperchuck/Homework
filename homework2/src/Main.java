import book.*;
import book.genre.Adventure;

public class Main {

    public static void main(String[] args) {
        Author danielDefo = new Author("Daniel", "Defo");
        Book robinsonCrusoe = new Adventure("Robinson Crusoe", danielDefo);
        robinsonCrusoe.buy(); // 25
        robinsonCrusoe.buy(15);
    }
}
