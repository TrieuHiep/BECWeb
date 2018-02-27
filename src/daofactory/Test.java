package daofactory;

import dao.bookdaopkg.BookDAO;
import model.itemspkg.bookpkg.Book;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        BookDAO bookDAO = daoFactory.getBookDAO();
        try {
            bookDAO.addBook(new Book());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
