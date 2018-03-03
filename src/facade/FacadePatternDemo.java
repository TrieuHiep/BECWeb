package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ItemsMaker itemsMaker = new ItemsMaker();

        itemsMaker.seeDetailsBook();
        itemsMaker.seeDetailsClothes();
        itemsMaker.seeDetailsElectronics();
    }
}
