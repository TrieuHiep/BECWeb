package daofactory;

import dao.electronicsdaopkg.LaptopDAO;
import dao.persondaopkg.CustomerDAO;
import dao.bookdaopkg.BookDAO;
import dao.electronicsdaopkg.ElectronicsDAO;
import daoimpl.ElectronicsDAOImpl;
import daoimpl.LaptopDAOImpl;

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

    @Override
    public LaptopDAO getLaptopDAO() {
        return new LaptopDAOImpl();
    }

}
