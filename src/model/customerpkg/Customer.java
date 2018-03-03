package model.customerpkg;
import model.dao.BookDao;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;
import observerpkg.Observer;

public class Customer extends Person implements Observer {
    private BookDao bookDao;
    private String idCardMember;
    public Customer() {
        super();
    }

    public Customer(int idPerson, FullName fullName, Account account, Address address, int age, String idCardMember) {
        super(idPerson, fullName, account, address, age);
        this.idCardMember = idCardMember;
    }

    public String getIdCardMember() {
        return idCardMember;
    }

    public void setIdCardMember(String idCardMember) {
        this.idCardMember = idCardMember;
    }

    @Override
    public void Update() {
        System.out.println("Sach moi them vao kia!");
    }
}
