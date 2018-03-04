package model.itemspkg.electronicspkg;

public class Laptop extends Electronic{
    private String resolution;
    private String ramCapacity;
    private String cpuType;
    private String busSpeed;
    private String hddCapacity;

    public Laptop() {
    }

    public Laptop(String idProduct, String name, String color, double price,
                  String power,
                  String resolution, String ramCapacity, String cpuType, String busSpeed, String hddCapacity) {
        super(idProduct, name, color, price, power);
        this.resolution = resolution;
        this.ramCapacity = ramCapacity;
        this.cpuType = cpuType;
        this.busSpeed = busSpeed;
        this.hddCapacity = hddCapacity;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getBusSpeed() {
        return busSpeed;
    }

    public void setBusSpeed(String busSpeed) {
        this.busSpeed = busSpeed;
    }

    public String getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(String hddCapacity) {
        this.hddCapacity = hddCapacity;
    }
}
