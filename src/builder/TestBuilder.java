package builder;

import model.itemspkg.electronicspkg.Laptop;

public class TestBuilder {
    public static void main(String[] args) {
        LaptopBuilder laptopBuilder =
                new LaptopBuilderImpl("PC5", "ASUS", 15000000);
        Laptop laptop = laptopBuilder
                .buildColor("BLACK")
                .buildPower("120W")
                .buildBusSpeed("1600Hz")
                .buildCpuType("Intel Core i5 3.2 GHz")
                .buildHddCapacity("1 TB")
                .buildResolution("1366x768")
                .buildRamCapacity("8 GB")
                .build();
        System.out.println(laptop.getPower());
    }
}
