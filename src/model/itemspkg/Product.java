package model.itemspkg;

public class Product {
    protected String idProduct;
    protected String name;
    protected String color;
    protected double price;

    public Product() {
    }

    public Product(String idProduct, String name, String color, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
