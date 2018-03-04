package Builder;

public abstract class TechniqueBook extends Book implements Item {


    @Override
    public Packing packing() {
        return new Book();
    }

    @Override
    public abstract float price();

}
