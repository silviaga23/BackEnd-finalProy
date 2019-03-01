package cr.brainstation.store.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "User")
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, name ="email")
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    private Date birthdate;

    private String token;

    private int phone;

    private Date memberSince;

    @OneToMany(mappedBy = "user")
    private Set<PaymentDTO> listPayments;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userAd")
    @JsonIgnore
    private Set<AddressDTO> listAddress;

    @OneToMany(mappedBy = "user")
    private Set<PurchaseDTO> listPurchases;

    public UserDTO () {
        super();
    }

    public UserDTO(String email, String name, String lastName, String password,int phone) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.phone = phone;
        this.listPayments = new HashSet<>();
        this.listAddress = new HashSet<>();
        this.listPurchases = new HashSet<>();
    }

    public UserDTO(String email, String name, String lastName, String password, Date birthdate, String token, int phone, Date memberSince) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.birthdate = birthdate;
        this.token = "";
        this.phone = phone;
        this.memberSince = null;
        this.listPayments = new HashSet<>();
        this.listAddress = new HashSet<>();
        this.listPurchases = new HashSet<>();
    }

/*    public Set<PaymentDTO> getListPayments() {
        return listPayments;
    }*/

    public void setListPayments(Set<PaymentDTO> listPayments) {
        this.listPayments = listPayments;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getToken() {
        return token;
    }

    public int getPhone() {
        return phone;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public void addPayment(PaymentDTO payment){
        this.listPayments.add(payment);
    }

    public void addAddress(AddressDTO address){
        this.listAddress.add(address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  public Set<AddressDTO> getListAddress() {
        return listAddress;
    }*/

    public void setListAddress(Set<AddressDTO> listAddress) {
        this.listAddress = listAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*
    public Set<PurchaseDTO> getListPurchases() {
        return listPurchases;
    }*/

    public void setListPurchases(Set<PurchaseDTO> listPurchases) {
        this.listPurchases = listPurchases;
    }
}
