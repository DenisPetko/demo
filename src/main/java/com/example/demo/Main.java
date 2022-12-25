package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев Николаевич", "Толстой");
        Author author1 = new Author("Михаил Афанасьевич", "Булгаков");
        Book book = new Book("Война и Мир", author, 1867);
        Book book1 = new Book("Мастер и Маргарита", author1, 1966);
        System.out.println("author.getFirstName() = " + author.getFirstName());
        System.out.println("author.getLastName() = " + author.getLastName());
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("book.getNameAuthor() = " + book.getNameAuthor());
        System.out.println("book.getPublicationDate() = " + book.getPublicationDate());
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getNameAuthor() = " + book1.getNameAuthor());
        System.out.println("book1.getPublicationDate() = " + book1.getPublicationDate());
        book1.setPublicationDate(1967);
        System.out.println("book1.getPublicationDate() = " + book1.getPublicationDate());
        System.out.println(book);
        System.out.println(author.equals(author1));
        System.out.println(book.equals(book1));

    }
}
