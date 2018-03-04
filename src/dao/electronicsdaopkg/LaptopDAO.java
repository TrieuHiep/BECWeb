package dao.electronicsdaopkg;

import model.itemspkg.Product;
import model.itemspkg.electronicspkg.Electronic;
import model.itemspkg.electronicspkg.Laptop;
import utils.SQLServerConnector;

import java.sql.SQLException;
import java.util.List;

public interface LaptopDAO {
    public abstract List<Laptop> getAll() throws SQLException;
    public abstract Laptop[] getAllVersion2() throws SQLException;
}
