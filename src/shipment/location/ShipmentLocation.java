package shipment.location;


import model.orderpkg.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class ShipmentLocation {
    protected List<Order> orderList;

    public ShipmentLocation() {
        this.orderList = new ArrayList<>();
    }

    public ShipmentLocation(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    public abstract double calculateShipmentFee();
}
