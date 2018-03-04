package decorator;

import model.itemspkg.clothespkg.Clothes;

public class ClothInformation implements Productable{
    private Clothes cloth;

    @Override
    public void viewDetail() {
        System.out.println("Day la chi tiet quan ao");
    }

    public Clothes getCloth() {
        return cloth;
    }

    public void setCloth(Clothes cloth) {
        this.cloth = cloth;
    }
}
