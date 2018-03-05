package Model.User;

public class Person {
    private FullName fullName;
    private Account account;
    private Address address;
    private int age;

    public Person(){}

    public Person(FullName fullName, Account account, Address address, int age) {
        this.fullName = fullName;
        this.account = account;
        this.address = address;
        this.age = age;
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
