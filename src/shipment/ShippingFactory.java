package shipment;

import shipment.location.ShipmentLocation;
import shipment.type.ShipmentType;

public interface ShippingFactory {
    public abstract ShipmentLocation getShipmentFeeLocation(String location);
    public abstract ShipmentType getShipmentFeeType(String type);
}
