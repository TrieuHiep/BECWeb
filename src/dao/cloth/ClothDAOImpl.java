package dao.cloth;

import model.itemspkg.bookpkg.Book;
import model.itemspkg.clothespkg.Clothes;
import utils.MySQLUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClothDAOImpl implements ClothDAO {
    @Override
    public List<Clothes> getAllCloth() {

        Connection con = new MySQLUtils().getConnection();
        String sqlCommand = "SELECT * FROM cloth";
        PreparedStatement ps = null;
        List<Clothes> list = new ArrayList<>();
        try {
            ps = con.prepareStatement(sqlCommand);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }
}
