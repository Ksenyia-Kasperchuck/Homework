package com.homework.app.book;

public class Author {
    private String firstName;
    private String lastName;
    private String book;

    public Author() {
    }

    public Author(String firstName, String lastName, String book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String concatToFullName() {
        return firstName + " " + lastName + " " + book;
    }
}

