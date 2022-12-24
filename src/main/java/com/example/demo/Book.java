package com.example.demo;

public class Book {
    private String title;
    private Author nameAuthor;
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

}
