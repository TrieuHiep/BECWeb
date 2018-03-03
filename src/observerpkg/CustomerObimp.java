package observerpkg;

import model.customerpkg.Customer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;

public class CustomerObimp extends Customer implements Observer {
    private Subject sub = null;

    public CustomerObimp() {
        super();
    }

    public CustomerObimp(int idPerson, FullName fullName, Account account, Address address, int age, String idCardMember, Subject sub) {
        super(idPerson, fullName, account, address, age, idCardMember);
        this.sub = sub;
    }

    public Subject getSub() {
        return sub;
    }

    public Subject setSub(Subject sub) {
        return this.sub = sub;
    }
    @Override
    public void Update() {
        System.out.println("Sach co ID: "+sub.getState()+ " moi them vao kia!");
    }
}
