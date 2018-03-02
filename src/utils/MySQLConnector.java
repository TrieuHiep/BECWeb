package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    private static MySQLConnector instance = new MySQLConnector();
    private Connection connection;
    private String url = "jdbc:mysql://127.0.0.1:3306/boecdb?useSSL=false";
    private String username = "root";
    private String password = "nthangzuzu";

    private MySQLConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getMySQLConnection() {
        return connection;
    }

    public static synchronized MySQLConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new MySQLConnector();
        } else if (instance.getMySQLConnection().isClosed()) {
            instance = new MySQLConnector();
        }
        return instance;
    }
}
