package daoimpl;

import dao.persondaopkg.FullNameDAO;
import model.userpkg.FullName;
import utils.MySQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FullNameDAOImpl implements FullNameDAO{
    private Connection connection;

    public FullNameDAOImpl() {
        try {
            this.connection = MySQLConnector.getInstance().getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addFullName(FullName fullName) throws SQLException {
        String sqlCommand = "INSERT INTO fullname(firstname, midname, lastname) VALUES(?,?,?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, fullName.getFirstName());
        statement.setString(2, fullName.getMidName());
        statement.setString(3, fullName.getLastName());
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
