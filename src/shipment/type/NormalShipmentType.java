package shipment.type;

public class NormalShipmentType implements ShipmentType{
    @Override
    public double calculateFee() {
        return 10;
    }
}
