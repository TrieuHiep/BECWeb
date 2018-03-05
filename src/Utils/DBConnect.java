package Utils;

import java.sql.Connection;

public class DBConnect {
    public Connection openConnection(){
        return MySQLConnector.getMySQLConnector();
    }
}
