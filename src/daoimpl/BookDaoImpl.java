package daoimpl;

import dao.bookdaopkg.BookDAO;
import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDAO{ //for MySQL
    @Override
    public boolean addBook(Book book) throws SQLException {
        System.out.println("save book to mysql dbms");
        return false;
    }

    @Override
    public List<Book> searchBook() throws SQLException {
        return null;
    }
}
