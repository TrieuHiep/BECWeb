package facade;

import model.itemspkg.bookpkg.Book;
import model.itemspkg.clothespkg.Clothes;
import model.itemspkg.electronicspkg.Electronics;

public class ItemsMaker {

    private Book book;
    private Clothes clothes;
    private Electronics electronics;


    public ItemsMaker(){
        book = new Book();
        clothes = new Clothes();
        electronics = new Electronics();
    }

    public void seeDetailsBook() {
        book.seeDetails();

    }

    public void seeDetailsClothes() {
        clothes.seeDetails();

    }

    public void seeDetailsElectronics() {
        electronics.seeDetails();

    }

}
