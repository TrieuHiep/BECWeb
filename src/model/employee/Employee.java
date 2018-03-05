package Model.employee;

import Model.User.Person;

public class Employee extends Person {
    private String idEmployee;

    public Employee(){}
    public Employee(String idEmployee){
        this.idEmployee = idEmployee;
    }
}
