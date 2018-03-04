package decorator;

public class BookDecorator extends ProductDecorator{
    private String translator;
    public BookDecorator(Productable productable) {
        super(productable);
    }

    @Override
    public void viewDetail() {
        super.viewDetail();

    }
    public void displayTranslator(){
        System.out.println("Translator Do Nhat Nam");
    }
}
