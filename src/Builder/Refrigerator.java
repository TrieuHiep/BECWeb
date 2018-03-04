package Builder;

public abstract class Refrigerator extends Book implements Item {

    @Override
    public Packing packing() {
        return new Electronic();
    }

    @Override
    public abstract float price();

}
