package model.customerpkg;

import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;

public class Customer extends Person {
    protected String email;

    public Customer() {
    }

    public Customer(FullName fullName, Account account, Address address, int age, String email) {
        super(fullName, account, address, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
