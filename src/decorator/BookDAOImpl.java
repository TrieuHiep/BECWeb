package decorator;

public class BookDAOImpl implements Productable {
    @Override
    public void displayCusInfo() {
        System.out.println("Day la thong tin khach hang mua sach");
    }
}
