package daoimpl;

import dao.PersonDAO;
import model.userpkg.Person;
import utils.MySQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO {
    private Connection connection;

    public PersonDAOImpl() {
        try {
            this.connection = MySQLConnector.getInstance().getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addPerson(Person person) throws SQLException {
        String sqlCommand =
                "INSERT INTO person(idfullname,idaccount,idaddress,age) " +
                        "VALUES ((SELECT MAX(idfullname) FROM fullname)," +
                        "?,(SELECT MAX(idaddress) FROM address),?) ";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, person.getAccount().getUsername());
        statement.setInt(2, person.getAge());
        this.connection.setAutoCommit(false);
        try {
            int aff = statement.executeUpdate();
            this.connection.commit();
            if (aff > 0) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            this.connection.rollback();
        }
        return false;
    }
}
