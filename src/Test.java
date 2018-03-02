import dao.PersonDAO;
import daoimpl.PersonDAOImpl;
import facade.CustomerFacade;
import model.customerpkg.Customer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test {
    public static FullName FullNameParser(String fullName) {
        if (fullName != null) {
            StringTokenizer stk = new StringTokenizer(fullName, " ");
            FullName fullNameObject = new FullName();
            List<String> nameList = new ArrayList<>();
            while (stk.hasMoreTokens()) {
                nameList.add(stk.nextToken());
            }
            fullNameObject.setFirstName(nameList.get(0));
            fullNameObject.setLastName(nameList.get(nameList.size() - 1));
            String midName = "";
            for (int i = 1; i < nameList.size() - 1; i++) {
                midName += nameList.get(i)+ " ";
            }
            fullNameObject.setMidName(midName);
            return fullNameObject;
        }
        return null;
    }
    public static void main(String[] args) {
//        Account account = new Account("tatsuya","nthangzuzu");
//        FullName fullName = new FullName("Trieu","Tuan","Hiep");
//        Address address = new Address("Nguyen Huu Tho","Hoang Mai","Ha Noi");
////        Person person = new Person(fullName,account,address,23);
////        PersonDAO personDAO = new PersonDAOImpl();
////        try {
////            personDAO.addPerson(person);
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//        Customer customer = new Customer(fullName,account,address,23,"hiep@gmail.com");
//        CustomerFacade customerFacade = new CustomerFacade();
//        customerFacade.saveCustomerData(customer);

        FullName fullName = FullNameParser("Trieu Hiep");
        System.out.println(fullName.getFirstName());
        System.out.println(fullName.getMidName());

        System.out.println(fullName.getLastName());
    }
}
