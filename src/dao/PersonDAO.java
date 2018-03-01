package dao;

import model.userpkg.Person;

import java.sql.SQLException;

public interface PersonDAO {
    public abstract boolean addPerson(Person person) throws SQLException;
}
