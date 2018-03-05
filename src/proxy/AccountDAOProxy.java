package proxy;

import dao.persondaopkg.AccountDAO;
import daoimpl.AccountDAOImpl;
import model.employeepkg.Employee;
import model.employeepkg.Permission;
import model.userpkg.Account;

import java.sql.SQLException;

public class AccountDAOProxy implements AccountDAO {
    private AccountDAOImpl accountDAO;
    private boolean validPermission;

    public AccountDAOProxy(Employee employee) {
        this.validPermission = employee.getPermission().getPermissionName().equals("ADMIN");
    }

    public AccountDAOProxy(AccountDAOImpl accountDAO, boolean validPermission) {
        this.accountDAO = accountDAO;
        this.validPermission = validPermission;
    }

    @Override
    public boolean addAccount(Account account) throws SQLException {
        return false;
    }

    @Override
    public boolean checkAccount(Account account) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteAccount(Account account) throws SQLException {
        if (validPermission) {
            accountDAO.deleteAccount(account);
            return true;
        } else {
            System.out.println("Access denied");
        }
        return false;
    }
}
