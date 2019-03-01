package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.*;

public class User {

    private int id;
    @NotNull
    private String email;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String password;
    private Date birthdate;
    private String token;
    private int phone;
    @NotNull
    private Date memberSince;

    private Set<Payment> listPayments;
    private Set<Address> listAddress;
    private Set<Purchase> listPurchases;

    public User () {
        super();
    }

    public User(String email, Set<Purchase> list){
        this.email = email;
        this.listPurchases = list;
    }

    public User(int id, @NotNull String email, @NotNull String name, @NotNull String lastName, @NotNull String password, Date birthdate, String token, int phone, @NotNull Date memberSince) {
        this.id =id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.birthdate = birthdate;
        this.token = token;
        this.phone = phone;
        this.memberSince = memberSince;
        this.listPayments = new HashSet<>();
        this.listAddress = new HashSet<>();
        this.listPurchases = new HashSet<>();
    }

    public User(@NotNull String email, @NotNull String name, @NotNull String lastName,@NotNull String password, Date birthdate, String token, int phone, @NotNull Date memberSince) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.birthdate = birthdate;
        this.token = token;
        this.phone = phone;
        this.memberSince = memberSince;
        this.listPayments = new HashSet<>();
        this.listAddress = new HashSet<>();
        this.listPayments = new HashSet<>();
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

    public void addPayment(Payment payment){
        this.listPayments.add(payment);
    }

    public void addAddress(Address address){
        this.listAddress.add(address);
    }

    public int getId() {
        return id;
    }
/*

    public Set<Payment> getListPayments() {
        return listPayments;
    }
*/

    public void setId(int id) {
        this.id = id;
    }

    public void setListPayments(Set<Payment> listPayments) {
        this.listPayments = listPayments;
    }

/*    public Set<Address> getListAddress() {
        return listAddress;
    }*/

    public void setListAddress(Set<Address> listAddress) {
        this.listAddress = listAddress;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Purchase> getListPurchases() {
        return listPurchases;
    }

    public void setListPurchases(Set<Purchase> listPurchases) {
        this.listPurchases = listPurchases;
    }
}
