package shipment.location;

import shipment.ShippingFactory;
import shipment.type.ShipmentType;

public class ShipmentLocationFactory implements ShippingFactory {

    @Override
    public ShipmentLocation getShipmentFeeLocation(String location) {
        switch (location) {
            case "northern":
                return new NorthernShipment();
            case "southern":
                return new SouthernShipment();
            default:
                return null;
        }
    }

    @Override
    public ShipmentType getShipmentFeeType(String type) {
        return null;
    }
}
