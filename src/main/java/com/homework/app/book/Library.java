package com.homework.app.book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.homework.app.book.utils.JsonExec;
import com.homework.app.book.utils.ReadingFromFile;
import org.apache.log4j.Logger;;


public class Library {
    private static final String BOOKS_FILE_PATH = "books.json";
    private final Logger LOGGER = Logger.getLogger(String.valueOf(Library.class));

    private List<String> books;

    public Library() {
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void download() {
        LOGGER.info("Please,add you book in library");

        JsonExec jsonExec = new JsonExec();
        jsonExec.convertJavaToJsonFile(this, "books.json");
    }

    public static Library loadFromFile() throws FileNotFoundException {
        JsonExec jsonExec = new JsonExec();
        String libraryJson = ReadingFromFile.read(BOOKS_FILE_PATH);
        return jsonExec.convertJsonStrToLibraryPOJO(libraryJson);
    }
}

