package ru.mirea.practice1.book;

public class Book {

    private String name;
    private String author;
    private int pages;

    public Book(){}
    public Book(String name, String author, int pages){

        this.pages = pages;
        this.name = name;
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages(){
        return pages;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return "'"+this.name+"' by "+ this.author+" has "+this.pages+" pages";
    }
}