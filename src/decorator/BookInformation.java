package decorator;

import model.itemspkg.bookpkg.Book;

public class BookInformation implements Productable {
    private Book book;

    @Override
    public void viewDetail() {
        System.out.println("Day la chi tiet sach");
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
