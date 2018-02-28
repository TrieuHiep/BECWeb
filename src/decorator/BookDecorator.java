package decorator;

public class BookDecorator extends ProductDecorator{
    private String translator;
    public BookDecorator(Productable productable) {
        super(productable);
    }

    @Override
    public void displayCusInfo() {
        super.displayCusInfo();
        System.out.println("Translator is: "+translator);
    }
}
