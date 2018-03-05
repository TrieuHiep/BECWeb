package Model.User.customer;

import Model.User.Person;

public class Customer extends Person {
    private String email;

    public Customer(){}
    public Customer(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
