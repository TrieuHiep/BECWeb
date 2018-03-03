package observer;

public class CustomerObserver implements Observer{
    @Override
    public void update() {
        //gui email cho khach hang
        System.out.println("mail cho khach hang");
    }
}
