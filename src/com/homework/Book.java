package com.homework;

import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 08.11.21
 */

public class Book {

    void show() {
        System.out.println("База даних книжок, версія 0.1 \uD83D\uDCD6");
        System.out.println("Будь ласка, введіть назву книги:");
    }

    static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        Book book = new Book();
        book.show();
        title.setTitle(scanner());
        System.out.println("Також введіть ім'я атора книги: ");
        author.setAuthor(scanner());
        System.out.println("І не забудьте описати короткий сюжет книги: ");
        content.setContent(scanner());
        System.out.println("Інформацію успішно збережено ✅");
        System.out.println("Ви бажаєте переглянути збережену інформацію? \nДля цього напишіть англійску літеру \"y\" " +
                "без лапок, або ж натисніть будь-яку іншу клавішу і тисніть \"Enter\", для виходу з програми. ");
        char choice = scanner().toLowerCase().charAt(0);
        if (choice == 'y') {
            title.show();
            author.show();
            content.show();
        } else {
            System.out.println("Вихід із системи");
        }
    }
}
