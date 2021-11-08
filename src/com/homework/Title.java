package com.homework;

public class Title extends Book {
    private String title;

    @Override
    void show() {
        System.out.println((char) 27 + "[33m" + "\nНазва книги: ");
        System.out.println(getTitle());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
