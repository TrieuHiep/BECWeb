import model.customerpkg.Customer;
import model.dao.BookDao;
import model.dao.BookDaoimp;
import model.itemspkg.bookpkg.Book;
import observerpkg.CustomerObimp;
import observerpkg.Observer;
import observerpkg.Subject;

public class Test {
    public static void main(String[] args) {
        Observer ob1 = new CustomerObimp();
        Observer ob2 = new CustomerObimp();
        Observer ob3 = new CustomerObimp();
        Subject sub = new BookDaoimp();

        sub.Register(ob1);
        sub.Register(ob2);
        sub.Register(ob3);

        ob1.setSub(sub);
        ob2.setSub(sub);
        ob3.setSub(sub);

        BookDao bookdao = (BookDao) sub;
        Book a = new Book(1);
        bookdao.addBook(a);
        sub.Unregister(ob3);
        Book b = new Book(2);
        bookdao.addBook(b);
    }
}
