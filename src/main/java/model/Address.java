package model;

public class Address {

    private String id;
    private String country;
    private String city;
    private String distinct;
    private String street;

    public Address(String id, String country, String city, String distinct, String street) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.distinct = distinct;
        this.street = street;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return  "adres idsi : " + id + "," +"ulke : " + country + "," +"sehir : " + city + ","
                + "eyalet : " + distinct + "," +"sokak : " + street;
    }
}
