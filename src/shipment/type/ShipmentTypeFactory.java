package shipment.type;

import shipment.ShippingFactory;
import shipment.location.ShipmentLocation;

public class ShipmentTypeFactory implements ShippingFactory {

    @Override
    public ShipmentLocation getShipmentFeeLocation(String location) {
        return null;
    }

    @Override
    public ShipmentType getShipmentFeeType(String type) {
        switch (type) {
            case "normal":
                return new NormalShipmentType();
            case "fast":
                return new FastShipmenType();
            default:
                return null;
        }
    }
}
