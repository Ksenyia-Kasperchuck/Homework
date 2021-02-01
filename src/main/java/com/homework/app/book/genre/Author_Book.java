package com.homework.app.book.genre;
import java.util.Scanner;
import org.apache.log4j.Logger;;

public class Author_Book {
    public static void main(String[] args) {
        final Logger LOGGER = Logger.getLogger(String.valueOf(Author_Book.class));
        final int price= 15;
        final int price2=20;
        String author;
        Scanner scanner=new Scanner(System.in);
        author= scanner.nextLine();
        switch (author){
            case "Daniel Defo":
                LOGGER.info ("Robinson Crusoe"+ " "+price+"$");
                LOGGER.info("Captain Singleton"+" "+ price+"$");
                LOGGER.info("Memoirs of a Cavalier"+ " "+price+"$");
                break;
            case  "Mark Twain":
                LOGGER.info("Innocents Abroad"+ " "+price2+"$");
                LOGGER.info("Punch, Brothers, Punch! and other Sketches"+" "+ price2+"$");
                LOGGER.info("Knights of Labor: The New Dynasty"+" "+ price2+"$");
                break;
            case "Jules Verne":
                LOGGER.info("The Floating Island"+" "+ price+"$");
                LOGGER.info("Around the World in 80 days"+ " "+price+"$");
                LOGGER.info("Off on a Comet"+" "+ price+"$");
                break;
            default:
                LOGGER.info("Not Found");
        }
    }
}
