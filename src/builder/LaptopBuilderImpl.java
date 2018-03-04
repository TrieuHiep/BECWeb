package builder;

import model.itemspkg.electronicspkg.Laptop;

public class LaptopBuilderImpl implements LaptopBuilder {
    private Laptop laptop= new Laptop();;

    public LaptopBuilderImpl(String id, String name, double price) {
        laptop.setIdProduct(id);
        laptop.setName(name);
        laptop.setPrice(price);
    }

    @Override
    public LaptopBuilder buildPower(String power) {
        this.laptop.setPower(power);
        return this;
    }

    @Override
    public LaptopBuilder buildColor(String color) {
        this.laptop.setColor(color);
        return this;
    }

    @Override
    public LaptopBuilder buildResolution(String resolution) {
        this.laptop.setResolution(resolution);
        return this;
    }

    @Override
    public LaptopBuilder buildRamCapacity(String ramCapacity) {
        this.laptop.setRamCapacity(ramCapacity);
        return this;
    }

    @Override
    public LaptopBuilder buildCpuType(String cpuType) {
        this.laptop.setCpuType(cpuType);
        return this;
    }

    @Override
    public LaptopBuilder buildBusSpeed(String busSpeed) {
        this.laptop.setBusSpeed(busSpeed);
        return this;
    }

    @Override
    public LaptopBuilder buildHddCapacity(String hddCapacity) {
        this.laptop.setHddCapacity(hddCapacity);
        return this;
    }

    @Override
    public Laptop build() {
        return this.laptop;
    }
}
