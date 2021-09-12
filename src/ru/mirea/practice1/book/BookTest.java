package ru.mirea.practice1.book;

public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Leo Tolstoy", 1225);
        Book b2 = new Book();
        b2.setName("Fahrenheit 451");
        b2.setAuthor("Ray Bradbury");
        b2.setPages(256);
        System.out.println(b1);
        System.out.println(b2);
    }
}