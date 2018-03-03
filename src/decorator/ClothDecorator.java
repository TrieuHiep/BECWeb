package decorator;

public class ClothDecorator extends ProductDecorator {

    public ClothDecorator(Productable productable) {
        super(productable);
    }

    @Override
    public void displayCusInfo() {
        super.displayCusInfo();
    }
    public void displayResource(){
        System.out.println("Made in Japan");
    }
}
