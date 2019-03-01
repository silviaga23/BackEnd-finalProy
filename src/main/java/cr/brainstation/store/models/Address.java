package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Address {

    private int id;

    private String name;

    private String lastName;

    private String street;

    private String phoneNumber;
    private String numberHouse;

    private String zipCode;

    private String city;

    private String country;

    @NotNull
    private User user;

    public Address(){
        super();
    }

    public Address(int id, String name, String lastName, String street, String phoneNumber, String numberHouse, String zipCode, String city, String country, @NotNull User user) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.numberHouse = numberHouse;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.user = user;
    }

    public Address(String name, String street, String phoneNumber, String numberHouse, String zipCode, String city, String country, @NotNull User user) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.numberHouse = numberHouse;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.user = user;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
