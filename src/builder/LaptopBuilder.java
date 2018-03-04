package builder;

import model.itemspkg.electronicspkg.Laptop;

public interface LaptopBuilder {
    public abstract LaptopBuilder buildPower(String power);

    public abstract LaptopBuilder buildColor(String color);

    public abstract LaptopBuilder buildResolution(String resolution);

    public abstract LaptopBuilder buildRamCapacity(String ramCapacity);

    public abstract LaptopBuilder buildCpuType(String cpuType);

    public abstract LaptopBuilder buildBusSpeed(String busSpeed);

    public abstract LaptopBuilder buildHddCapacity(String hddCapacity);

    public abstract Laptop build();
}
