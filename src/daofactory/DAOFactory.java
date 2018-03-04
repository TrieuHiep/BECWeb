package daofactory;

import dao.bookdaopkg.BookDAO;
import dao.electronicsdaopkg.ElectronicsDAO;
import dao.electronicsdaopkg.LaptopDAO;
import dao.persondaopkg.CustomerDAO;

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int SQLServer = 2;

    public abstract CustomerDAO getCustomerDAO();

    public abstract BookDAO getBookDAO();

    public abstract ElectronicsDAO getElectronicsDAO();

    public abstract LaptopDAO getLaptopDAO();

    public static DAOFactory getDAOFactory(int type) {
        switch (type) {
            case MYSQL:
                return new MySQLDAOFactory();
            case SQLServer:
                return new SQLServerDAOFactory();
            default:
                return null;
        }
    }
}
