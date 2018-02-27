package daoimpl;

import dao.bookdaopkg.BookDAO;
import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;

public class BookDaoImpl implements BookDAO{ //for MySQL
    @Override
    public boolean addBook(Book book) throws SQLException {
        System.out.println("save book to mysql dbms");
        return false;
    }
}
