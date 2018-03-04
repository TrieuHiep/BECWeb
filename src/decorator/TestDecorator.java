package decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Productable daoBook = new BookInformation();
        Productable daoCloth = new ClothInformation();

        BookDecorator bookDecorator = new BookDecorator(daoBook);
        bookDecorator.displayCusInfo();
        bookDecorator.displayTranslator();

        ClothDecorator clothDecorator = new ClothDecorator(daoCloth);
        clothDecorator.displayCusInfo();
        clothDecorator.displayResource();

    }
}
