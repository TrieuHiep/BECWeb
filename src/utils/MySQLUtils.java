package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLUtils {

    public Connection getConnection(){
        Connection connection = null;
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            String url = "jdbc:mysql://localhost:3306/bookstoredb?useSSL=true";

            String username = "root";
            String password = "12345678";

            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
