package daofactory;

import dao.electronicsdaopkg.LaptopDAO;
import dao.persondaopkg.CustomerDAO;
import dao.bookdaopkg.BookDAO;
import dao.electronicsdaopkg.ElectronicsDAO;
import daoimpl.BookDaoImpl;
import daoimpl.CustomerDAOImpl;

public class MySQLDAOFactory extends DAOFactory {
    @Override
    public CustomerDAO getCustomerDAO() {
        return new CustomerDAOImpl();
    }

    @Override
    public BookDAO getBookDAO() {
        return new BookDaoImpl();
    }

    @Override
    public ElectronicsDAO getElectronicsDAO() {
        return null;
    }

    @Override
    public LaptopDAO getLaptopDAO() {
        return null;
    }

}
