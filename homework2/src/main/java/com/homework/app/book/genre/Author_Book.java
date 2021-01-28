package main.java.ksenia.app.book.genre;
import java.util.Scanner;

public class Author_Book {
    public static void main(String[] args) {
        final int price= 15;
        final int price2=20;
        String author;
        Scanner scanner=new Scanner(System.in);
        author= scanner.nextLine();
        switch (author){
            case "Daniel Defo":
                System.out.println("Robinson Crusoe"+ " "+price+"$");
                System.out.println("Captain Singleton"+" "+ price+"$");
                System.out.println("Memoirs of a Cavalier"+ " "+price+"$");
                break;
            case  "Mark Twain":
                System.out.println("Innocents Abroad"+ " "+price2+"$");
                System.out.println("Punch, Brothers, Punch! and other Sketches"+" "+ price2+"$");
                System.out.println("Knights of Labor: The New Dynasty"+" "+ price2+"$");
                break;
            case "Jules Verne":
                System.out.println("The Floating Island"+" "+ price+"$");
                System.out.println("Around the World in 80 days"+ " "+price+"$");
                System.out.println("Off on a Comet"+" "+ price+"$");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
