package book.genre;

import book.Author;
import book.Book;

import java.util.*;

public class Adventure_Author {
    public static void main(String[] args) {
        List<String> listAdventureAuthor = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String author_name = scanner.nextLine();
            listAdventureAuthor.add(author_name);
        }


        for (String name : listAdventureAuthor) {
            System.out.println(name);
        }

        System.out.println();

        List<String> list_2_AdventureAuthor = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            String author_name1 = scanner.nextLine();
            list_2_AdventureAuthor.add(author_name1);
        }


        list_2_AdventureAuthor.add("Joanne Rowling");
        list_2_AdventureAuthor.add("Ernest Hemingway");
        list_2_AdventureAuthor.add("James Clavell");
        list_2_AdventureAuthor.remove(0);

        System.out.println(list_2_AdventureAuthor);

        System.out.println();

        HashSet list_3_AdventureAuthor = new HashSet();
        for (int i = 0; i < 3; i++) {
            String author_name2 = scanner.nextLine();
            list_3_AdventureAuthor.add(author_name2);
        }

        list_3_AdventureAuthor.add("Alexandre Dumas");
        list_3_AdventureAuthor.add("Rafael Sabatini");
        list_3_AdventureAuthor.add("Maurice Druon");
        list_3_AdventureAuthor.remove(5);

        System.out.println(list_3_AdventureAuthor);

    }

}



