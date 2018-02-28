package decorator;

public class ClothDecorator extends ProductDecorator {

    public ClothDecorator(Productable productable) {
        super(productable);
    }

    @Override
    public void displayCusInfo() {
        super.displayCusInfo();
    }
    public void displayResource(String resource){
        System.out.println("Made in "+resource);
    }
}
