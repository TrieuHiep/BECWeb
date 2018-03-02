package dao.persondaopkg;

import model.userpkg.FullName;

import java.sql.SQLException;

public interface FullNameDAO {
    public abstract boolean addFullName(FullName fullName) throws SQLException;
}