package model.employeepkg;

import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;

public class Employee extends Person {
    private String internalMail;
    private Permission permission;

    public Employee() {
    }

    public Employee(FullName fullName, Account account, Address address, int age, String internalMail) {
        super(fullName, account, address, age);
        this.internalMail = internalMail;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getInternalMail() {
        return internalMail;
    }

    public void setInternalMail(String internalMail) {
        this.internalMail = internalMail;
    }
}
