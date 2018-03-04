import model.userpkg.FullName;
import utils.SQLServerConnector;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        try {
            SQLServerConnector.getInstance().getSQLServerConnection();
            System.out.println("OK");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
