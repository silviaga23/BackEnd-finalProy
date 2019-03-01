package cr.brainstation.store.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Purchase")
public class PurchaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, name ="date")
    private Date date;

    @Column(nullable = false, name ="amount")
    private double amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", nullable = false)
    private UserDTO user;

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProductPurchaseDTO> productPurchase;

    @OneToOne
    @JoinColumn(name="address_id")
    private AddressDTO address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="payment_id", nullable = false)
    private PaymentDTO payment;

    public PurchaseDTO(){
        super();
    }

    public PurchaseDTO(Date date, double amount, UserDTO user) {
        this.date = date;
        this.amount = amount;
        this.user = user;
    }

    public PurchaseDTO(Date date, double amount, UserDTO user, AddressDTO address, PaymentDTO payment) {
        this.date = date;
        this.amount = amount;
        this.user = user;
        this.productPurchase = productPurchase;
        this.address = address;
        this.payment = payment;
    }

    public PurchaseDTO(Date date, double amount, UserDTO user, List<ProductPurchaseDTO> productPurchase, AddressDTO address, PaymentDTO payment) {
        this.date = date;
        this.amount = amount;
        this.user = user;
        this.productPurchase = productPurchase;
        this.address = address;
        this.payment = payment;
    }

    public List<ProductPurchaseDTO> getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(List<ProductPurchaseDTO> productPurchase) {
        this.productPurchase = productPurchase;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }


}
