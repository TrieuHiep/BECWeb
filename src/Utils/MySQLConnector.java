package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    public Connection connection;
    public static Connection getMySQLConnector(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/BECStore";
        String dbName = "BECStore";
        String username = "root";
        String password  ="yennguyen1996";
        return getMySQLConnector();

    }
    private Connection getMySQLConnector(String driver, String url, String dbname, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);

    }

}
