package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLServerConnector {
    private static SQLServerConnector instance = new SQLServerConnector();
    private Connection connection;

    private SQLServerConnector() {
        try {
            Properties properties = new Properties();
            properties.load(
                    this.getClass().getClassLoader()
                            .getResourceAsStream("SQLServer_DBInfo.prop"));

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

    public static SQLServerConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new SQLServerConnector();
        } else if (instance.getSQLServerConnection().isClosed()) {
            instance = new SQLServerConnector();
        }
        return instance;
    }

    public Connection getSQLServerConnection() {
        return connection;
    }


}
