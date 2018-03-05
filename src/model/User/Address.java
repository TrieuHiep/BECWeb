package Model.User;

public class Address extends Person {
    private String street;
    private String city;
    private String region;
    public Address(){

    }
    public Address(String street, String city, String region){
        this.street = street;
        this.city = city;
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
