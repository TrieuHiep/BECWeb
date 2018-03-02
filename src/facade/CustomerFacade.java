package facade;

import dao.AccountDAO;
import dao.AddressDAO;
import dao.CustomerDAO;
import dao.FullNameDAO;
import daofactory.DAOFactory;
import daoimpl.AccountDAOImpl;
import daoimpl.AddressDAOImpl;
import daoimpl.FullNameDAOImpl;
import model.customerpkg.Customer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;

import java.sql.SQLException;

public class CustomerFacade {
    private FullNameDAO fullNameDAO;
    private AddressDAO addressDAO;
    private AccountDAO accountDAO;
    private CustomerDAO customerDAO;

    public CustomerFacade() {
        DAOFactory mysqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        this.customerDAO = mysqlDAOFactory.getCustomerDAO();
        this.accountDAO = new AccountDAOImpl();
        this.addressDAO = new AddressDAOImpl();
        this.fullNameDAO = new FullNameDAOImpl();
    }

    public boolean saveCustomerData(Customer customer) {
        FullName fullName = customer.getFullName();
        Address address = customer.getAddress();
        Account account = customer.getAccount();
        try {
            this.fullNameDAO.addFullName(fullName);
            this.addressDAO.addAddress(address);
            this.accountDAO.addAccount(account);
            this.customerDAO.addCustomer(customer);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
