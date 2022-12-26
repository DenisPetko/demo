package com.example.demo;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author nameAuthor;
    private int publicationDate;

    public Book(String title, Author nameAuthor, int publicationDate) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Название: " + title + "; Автор: " + nameAuthor + "; Год публикации: " + publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && Objects.equals(title, book.title) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, nameAuthor, publicationDate);
    }
}
