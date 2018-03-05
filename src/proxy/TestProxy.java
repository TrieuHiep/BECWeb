package proxy;

import dao.persondaopkg.AccountDAO;
import model.employeepkg.Employee;
import model.userpkg.Account;

import java.sql.SQLException;

public class TestProxy {
    public static void main(String[] args) throws SQLException {
        AccountDAO accountDAO = new AccountDAOProxy(new Employee());
        accountDAO.deleteAccount(new Account("tatsuya","abcxyz"));
    }
}
