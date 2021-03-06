package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnector {
    private static MySQLConnector instance = new MySQLConnector();
    private Connection connection;

    private MySQLConnector() {
        try {
            Properties properties = new Properties();
            properties.load(
                    this.getClass().getClassLoader()
                            .getResourceAsStream("MySQL_DBInfo.prop"));

            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
