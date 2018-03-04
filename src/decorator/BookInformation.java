package decorator;

import model.itemspkg.bookpkg.Book;

public class BookInformation implements Productable {
    private Book book;

    @Override
    public void displayCusInfo() {
        System.out.println("Day la thong tin khach hang mua sach");
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
