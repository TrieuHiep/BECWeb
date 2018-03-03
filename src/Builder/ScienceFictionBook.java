package Builder;

public abstract class ScienceFictionBook implements Item {

    @Override
    public Packing packing() {
        return new Book();
    }

    @Override
    public abstract float price();

}
