package factory;

import model.itemspkg.Product;

import java.sql.SQLException;

public abstract class ProductFactory {
    private static final int BOOKS = 1;
    private static final int ELECTRONICS = 2;
    private static final int CLOTHES = 3;

    public abstract Product[] getProduct(String type);

    public static ProductFactory getProductFactory(int productType) throws SQLException{
        switch (productType) {
            case BOOKS:
                return new BookFactory();
            case ELECTRONICS:
                return new ElectronicsFactory();
            default:
                return null;
        }
    }
}
