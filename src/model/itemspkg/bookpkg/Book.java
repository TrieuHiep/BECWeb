package model.itemspkg.bookpkg;

import model.itemspkg.Product;

public class Book extends Product {
    protected String author;
    protected Publisher publisher;

    public Book() {
    }

    public Book(String author, Publisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
