package dao.persondaopkg;

import model.customerpkg.Customer;
import model.userpkg.Account;

import java.sql.SQLException;

public interface CustomerDAO {
    public abstract boolean addCustomer(Customer customer) throws SQLException;

    public Customer getCustomer(Account account) throws SQLException;
}
