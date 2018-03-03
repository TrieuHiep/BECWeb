package decorator;

public class ClothDAOImpl implements Productable{
    @Override
    public void displayCusInfo() {
        System.out.println("Day la thong tin khach hang mua quan ao");
    }
}
