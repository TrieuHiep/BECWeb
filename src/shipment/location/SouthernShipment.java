package shipment.location;

import model.orderpkg.Order;

public class SouthernShipment extends ShipmentLocation {
    @Override
    public double calculateShipmentFee() {
        double t = 0;
        for (Order o : super.orderList) {
            t += o.getCart().getQuantity()*10;
        }
        return t;
    }
}
