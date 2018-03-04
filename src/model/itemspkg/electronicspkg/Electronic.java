package model.itemspkg.electronicspkg;

import model.itemspkg.Product;

public class Electronic extends Product {
    protected String power;

    public Electronic() {
    }

    public Electronic(String idProduct, String name, String color, double price, String power) {
        super(idProduct, name, color, price);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
