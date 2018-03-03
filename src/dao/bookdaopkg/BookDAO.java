package dao.bookdaopkg;

import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    public abstract boolean addBook(Book book) throws SQLException;

    public abstract List<Book> searchBook() throws SQLException;
}
