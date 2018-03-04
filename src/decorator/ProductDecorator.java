package decorator;

public abstract class ProductDecorator implements Productable {
    private Productable productable;

    public ProductDecorator(Productable productable) {
        this.productable = productable;
    }

    @Override
    public void viewDetail() {
        productable.viewDetail();
    }
}
