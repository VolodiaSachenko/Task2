package com.homework;

public class Content extends Book {
    private String content;

    @Override
    void show() {
        System.out.println("\nЗміст книги: ");
        System.out.println(getContent());
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
