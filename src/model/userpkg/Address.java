package model.userpkg;

public class Address {
    private String road;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String road, String district, String city) {
        this.road = road;
        this.district = district;
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
