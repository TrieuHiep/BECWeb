package model.itemspkg.bookpkg;

public class NovelBook extends Book {
    private int totalChapter;

    public NovelBook() {
    }

    public NovelBook(String bookName, String author,
                     double price, Publisher publisher,
                     int totalChapter) {
        super(author, publisher);
        this.totalChapter = totalChapter;
    }

    public int getTotalChapter() {
        return totalChapter;
    }

    public void setTotalChapter(int totalChapter) {
        this.totalChapter = totalChapter;
    }
}
