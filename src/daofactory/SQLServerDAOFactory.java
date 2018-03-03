package daofactory;

import dao.persondaopkg.CustomerDAO;
import dao.bookdaopkg.BookDAO;
import dao.electronicsdaopkg.ElectronicsDAO;
import daoimpl.ElectronicsDAOImpl;

public class SQLServerDAOFactory extends DAOFactory {
    @Override
    public CustomerDAO getCustomerDAO() {
        return null;
    }

    @Override
    public BookDAO getBookDAO() {
        return null;
    }

    @Override
    public ElectronicsDAO getElectronicsDAO() {
        return new ElectronicsDAOImpl();
    }

}
