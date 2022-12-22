package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев Николаевич", "Толстой");
        Author author1 = new Author("Михаил Афанасьевич", "Булгаков");
        Book book = new Book("Война и Мир", author , 1867);
        Book book1 = new Book("Мастер и Маргарита", author1, 1966);

        System.out.println();

    }
}
