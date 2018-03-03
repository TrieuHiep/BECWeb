package model.orderpkg;

public class Order {
    private Cart cart;
    private String location;

    public Order() {
    }

    public Order(Cart cart, String location) {
        this.cart = cart;
        this.location = location;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
