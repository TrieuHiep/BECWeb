package daoimpl;

import dao.persondaopkg.AccountDAO;
import model.userpkg.Account;
import utils.MySQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAOImpl implements AccountDAO{
    private Connection connection;

    public AccountDAOImpl() {
        try {
            this.connection = MySQLConnector.getInstance().getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAccount(Account account) throws SQLException {
        String sqlCommand = "INSERT INTO account VALUES(?,?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, account.getUsername());
        statement.setString(2,account.getPassword());
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
