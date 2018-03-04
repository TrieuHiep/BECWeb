package decorator;

import model.itemspkg.clothespkg.Clothes;

public class ClothInformation implements Productable{
    private Clothes cloth;

    @Override
    public void displayCusInfo() {
        System.out.println("Day la thong tin khach hang mua quan ao");
    }

    public Clothes getCloth() {
        return cloth;
    }

    public void setCloth(Clothes cloth) {
        this.cloth = cloth;
    }
}
