package dao;

import model.userpkg.Address;

import java.sql.SQLException;

public interface AddressDAO {
    public abstract boolean addAddress(Address address) throws SQLException;
}
