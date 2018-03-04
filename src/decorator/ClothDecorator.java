package decorator;

public class ClothDecorator extends ProductDecorator {

    public ClothDecorator(Productable productable) {
        super(productable);
    }

    @Override
    public void viewDetail() {
        super.viewDetail();
    }
    public void displayResource(){
        System.out.println("Made in Japan");
    }
}
