package dao.clothdaopkg;

import model.itemspkg.clothespkg.Cloth;

import java.sql.SQLException;

public interface ClothDAO {
    public abstract boolean addCloth(Cloth cloth) throws SQLException;
}
