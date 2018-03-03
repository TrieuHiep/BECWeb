package decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Productable daoBook = new BookDAOImpl();
        Productable daoCloth = new ClothDAOImpl();

        BookDecorator bookDecorator = new BookDecorator(daoBook);
        bookDecorator.displayCusInfo();
        bookDecorator.displayTranslator();

        ClothDecorator clothDecorator = new ClothDecorator(daoCloth);
        clothDecorator.displayCusInfo();
        clothDecorator.displayResource();

    }
}
