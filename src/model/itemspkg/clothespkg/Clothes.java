package model.itemspkg.clothespkg;

import model.itemspkg.ItemsInterface;
import model.itemspkg.Product;

import java.awt.event.ItemListener;

public class Clothes extends Product implements ItemsInterface {
    protected String size;


    public Clothes(String size) {
        this.size = size;
    }

    public Clothes(String id, String name, double price, String color, String size) {
        super(id, name, price, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void seeDetails() {

    }
}
