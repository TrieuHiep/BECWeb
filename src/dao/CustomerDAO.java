package dao;

import model.customerpkg.Customer;

import java.sql.SQLException;

public interface CustomerDAO {
    public abstract boolean addCustomer(Customer customer) throws SQLException;
}
