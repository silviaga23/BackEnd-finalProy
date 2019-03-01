package cr.brainstation.store.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Address")
public class AddressDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, name ="name")
    private String name;
    @Column(name ="lastName")
    private String lastName;
    @Column(nullable = false, name ="street")
    private String street;
    @Column(nullable = false, name ="phone_number")
    private String phoneNumber;
    private String numberHouse;
    @Column(nullable = false, name ="zipCode")
    private String zipCode;
    @Column(nullable = false, name ="city")
    private String city;
    @Column(nullable = false, name ="country")
    private String country;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private UserDTO userAd;

    public AddressDTO(){
        super();
    }

    public AddressDTO(String name, String street, String phoneNumber, String numberHouse, String zipCode, String city, String country, UserDTO userAd) {
        this.name = name;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.numberHouse = numberHouse;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.userAd = userAd;
    }

    public AddressDTO(int id, String street, String numberHouse, String zipCode, String city, String country, UserDTO user) {
        this.id = id;
        this.street = street;
        this.numberHouse = numberHouse;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.userAd = user;
    }

    public AddressDTO(String street, String numberHouse,String zipCode, String city,  String country,  UserDTO user) {

        this.street = street;
        this.numberHouse = numberHouse;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.userAd = user;
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

    public UserDTO getUserAd() {
        return userAd;
    }

    public void setUserAd(UserDTO userAd) {
        this.userAd = userAd;
    }
}
