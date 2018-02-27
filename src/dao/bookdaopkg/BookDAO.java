package dao.bookdaopkg;

import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;

public interface BookDAO {
    public abstract boolean addBook(Book book) throws SQLException;
}
