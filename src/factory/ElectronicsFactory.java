package factory;

import dao.electronicsdaopkg.LaptopDAO;
import daofactory.DAOFactory;
import daoimpl.LaptopDAOImpl;
import model.itemspkg.Product;
import model.itemspkg.electronicspkg.Electronic;

import java.sql.SQLException;
import java.util.List;

public class ElectronicsFactory extends ProductFactory {
    @Override
    public Product[] getProduct(String type) {
        switch (type) {
            case "laptop": {
                DAOFactory sqlServerDAOFactory = DAOFactory.getDAOFactory(DAOFactory.SQLServer);
                LaptopDAO laptopDAO = sqlServerDAOFactory.getLaptopDAO();
                try {
                    return laptopDAO.getAllVersion2();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            case "television":
                return null;
            default:
                return null;
        }
    }
}
