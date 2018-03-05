package dao.persondaopkg;

import model.userpkg.Account;

import java.sql.SQLException;

public interface AccountDAO {
    public abstract boolean addAccount(Account account) throws SQLException;

    public abstract boolean checkAccount(Account account) throws SQLException;

    public abstract boolean deleteAccount(Account account) throws SQLException;
}
