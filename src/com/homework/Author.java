package com.homework;

public class Author extends Book {
    private String author;

    @Override
    void show() {
        System.out.println("\nАвтор книги: ");
        System.out.println(getAuthor());
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
