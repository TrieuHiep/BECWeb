package model.itemspkg.bookpkg;

import model.itemspkg.ItemsInterface;

public class NovelBook extends Book {
    private int totalChapter;

    public NovelBook() {
    }

    public NovelBook(int idBook, String bookName, String author,
                     double price, Publisher publisher,
                     int totalChapter) {
        super(idBook, author, publisher);
        this.totalChapter = totalChapter;
    }

    public int getTotalChapter() {
        return totalChapter;
    }

    public void setTotalChapter(int totalChapter) {
        this.totalChapter = totalChapter;
    }
}
