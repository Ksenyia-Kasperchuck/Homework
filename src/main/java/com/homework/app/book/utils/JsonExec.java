package com.homework.app.book.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.app.book.Author;
import com.homework.app.book.Library;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;

public class JsonExec {

    private final static Logger LOGGER = Logger.getLogger(JsonExec.class);

    public String convertJavaToJsonStr(Object obj) {

        String jsonStr = "";

        try {
            jsonStr = new ObjectMapper().writeValueAsString(obj);
            LOGGER.info("----convert to string----");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonStr;
    }

    public void convertJavaToJsonFile(Object obj, String pathToFile) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("write to file, finished!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Author convertJsonStrToAuthorPOJO(String jsonStr) {

        Author author = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            author  = mapper.readValue(jsonStr, Author.class);
            LOGGER.info("-----convert to POJO-----");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return author;
    }

    public Library convertJsonStrToLibraryPOJO(String jsonStr) {

        Library library = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            library  = mapper.readValue(jsonStr, Library.class);
            LOGGER.info("-----convert to POJO-----");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return library;
    }
}
