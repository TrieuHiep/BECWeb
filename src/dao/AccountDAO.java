package dao;

import model.userpkg.Account;

import java.sql.SQLException;

public interface AccountDAO {
    public abstract boolean addAccount(Account account) throws SQLException;
}
