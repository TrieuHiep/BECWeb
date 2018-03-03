import model.customerpkg.Customer;
import model.dao.BookDao;
import model.dao.BookDaoimp;
import model.itemspkg.bookpkg.Book;
import observerpkg.Observer;
import observerpkg.Subject;

public class Test {
    public static void main(String[] args) {
        Observer ob1 = new Customer();
        Observer ob2 = new Customer();
        Observer ob3 = new Customer();
        Subject sub = new BookDaoimp();
        sub.Register(ob1);
        sub.Register(ob2);
        sub.Register(ob3);
        BookDao bookdao = (BookDao) sub;
        Book a = new Book();
        bookdao.addBook(a);
        sub.Unregister(ob3);
        Book b = new Book();
        bookdao.addBook(a);
    }
}
