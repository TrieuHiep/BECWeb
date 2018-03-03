package daoimpl;

import dao.bookdaopkg.BookDAO;
import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;
import java.util.List;

public class NovelBookDAOImpl implements BookDAO{
    @Override
    public boolean addBook(Book book) throws SQLException {
        return false;
    }

    @Override
    public List<Book> searchBook() throws SQLException {
        return null;
    }
}
