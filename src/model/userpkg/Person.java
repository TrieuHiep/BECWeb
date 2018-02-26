package model.userpkg;

public class Person {
    protected int idPerson;
    protected FullName fullName;
    protected Account account;
    protected Address address;
    protected int age;

    public Person() {
    }

    public Person(int idPerson, FullName fullName, Account account, Address address, int age) {
        this.idPerson = idPerson;
        this.fullName = fullName;
        this.account = account;
        this.address = address;
        this.age = age;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
