package daoimpl;

import dao.persondaopkg.CustomerDAO;
import dao.persondaopkg.PersonDAO;
import model.customerpkg.Customer;
import utils.MySQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {
    private Connection connection;

    public CustomerDAOImpl() {
        try {
            this.connection = MySQLConnector.getInstance().getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addCustomer(Customer customer) throws SQLException {
        PersonDAO personDAO = new PersonDAOImpl();
        personDAO.addPerson(customer);
        String sqlCommand = "INSERT INTO customer(idcustomer, email) VALUES((SELECT MAX(idperson) FROM person),?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, customer.getEmail());
        this.connection.setAutoCommit(false);
        try {
            int aff = statement.executeUpdate();
            this.connection.commit();
            if(aff > 0) return true;
        } catch (SQLException ex) {
            this.connection.rollback();
        }
        return false;
    }
}
