package daoimpl;

import dao.AddressDAO;
import model.userpkg.Address;
import utils.MySQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressDAOImpl implements AddressDAO {
    private Connection connection;

    public AddressDAOImpl() {
        try {
            this.connection = MySQLConnector.getInstance().getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAddress(Address address) throws SQLException {
        String sqlCommand = "INSERT INTO address(road, district, city) VALUES(?,?,?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, address.getRoad());
        statement.setString(2, address.getDistrict());
        statement.setString(3, address.getCity());
        this.connection.setAutoCommit(false);
        try {
            int aff = statement.executeUpdate();
            this.connection.commit();
            if (aff > 0) return true;
        } catch (SQLException ex) {
            this.connection.rollback();
        }
        return false;
    }
}
