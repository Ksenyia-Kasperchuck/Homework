import book.*;
import book.exeptions.DownloadException;
import book.genre.Adventure;

public class Main {

    public static void main(String[] args) throws DownloadException {
        Author danielDefo = new Author("Daniel", "Defo");
        Book robinsonCrusoe = new Adventure("Robinson Crusoe", danielDefo);
        robinsonCrusoe.buy(); // 25
        robinsonCrusoe.buy(15);




        try {
            robinsonCrusoe.download();
        } catch (DownloadException e) {
            System.out.println("No access!");
        }
        finally {
            System.out.println("Download finished");
        }

        String [] popular_books={"And Then There Were None","The Big Sleep","Gone Girl","In Cold Blood"};
        System.out.println(popular_books[23]);
    }
}