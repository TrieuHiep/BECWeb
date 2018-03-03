package Builder;

public abstract class Refrigerator implements Item {

    @Override
    public Packing packing() {
        return new Electronic();
    }

    @Override
    public abstract float price();

}
