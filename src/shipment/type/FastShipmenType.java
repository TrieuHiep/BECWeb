package shipment.type;

public class FastShipmenType implements ShipmentType {

    @Override
    public double calculateFee() {
        return 15;
    }
}
