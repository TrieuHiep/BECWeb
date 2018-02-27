package daofactory;

import dao.bookdaopkg.BookDAO;
import dao.electronicsdaopkg.ElectronicsDAO;
import daoimpl.BookDaoImpl;

public class MySQLDAOFactory extends DAOFactory {
    @Override
    public BookDAO getBookDAO() {
        return new BookDaoImpl();
    }

    @Override
    public ElectronicsDAO getElectronicsDAO() {
        return null;
    }
}
