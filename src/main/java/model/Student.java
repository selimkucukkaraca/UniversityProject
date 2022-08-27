package model;

public class Student {

    private String id;
    private String name;
    private String lastName;
    private String number;
    private String study;
    private Address address;

    public Student(String id, String name, String lastName, String number, String study, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.study = study;
        this.address = address;
    }

    /*
    public Student(String name, String lastName, String number, String study, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.study = study;
        this.address = address;
    }
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {    //
        return "Ogrenci id : " + id + "," + "Ogrenci adi : " +  name + "," + "Ogrenci soyadi : " +  lastName + "," +
                "Ogrenci numarasi : " + number + "," + "Ogrencinin bolumu : " +   study +  "," +  address;
    }
}
