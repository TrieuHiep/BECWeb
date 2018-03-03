package shipment;

import shipment.location.ShipmentLocation;
import shipment.location.ShipmentLocationFactory;
import shipment.type.ShipmentType;
import shipment.type.ShipmentTypeFactory;

public class Test {
    public static void main(String[] args) {
        ShippingFactory shippingLocationFactory = new ShipmentLocationFactory();
        ShipmentLocation shipmentLocation = shippingLocationFactory.getShipmentFeeLocation("southern");
        double shipmentLocationFee = shipmentLocation.calculateShipmentFee();

        ShippingFactory shippingTypeFactory = new ShipmentTypeFactory();
        ShipmentType shipmentType = shippingTypeFactory.getShipmentFeeType("fast");
        double shipmentTypeFee = shipmentType.calculateFee();

        double totalFee = shipmentLocationFee + shipmentTypeFee;
        System.out.println(totalFee);
    }
}
