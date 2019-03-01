package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Purchase {

    private int id;
    @NotNull
    private Date date;
    @NotNull
    private double amount;
    @NotNull
    private Address address;
    @NotNull
    private Payment payment;
    @NotNull
    private User user;

    private Set<Product> products;

    private List<ProductPurchase> productPurchase;

    public Purchase(){
        super();
    }

    public Purchase(@NotNull Date date, @NotNull double amount, @NotNull Address address, @NotNull Payment payment, @NotNull User user,  Set<Product> products, List<ProductPurchase> productPurchase) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.address = address;
        this.payment = payment;
        this.user = user;
        this.products = products;
        this.productPurchase = productPurchase;
    }

    public Purchase(int id, @NotNull Date date, @NotNull double amount, @NotNull User user, @NotNull Set<Product> products) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.user = user;
        this.products = products;
    }

    public Purchase(@NotNull Date date, @NotNull double amount, @NotNull User user) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.user = user;
    }

    public Purchase(@NotNull Date date, @NotNull double amount, @NotNull User user, @NotNull List<ProductPurchase> products) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.user = user;
        this.productPurchase = products;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<ProductPurchase> getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(List<ProductPurchase> productPurchase) {
        this.productPurchase = productPurchase;
    }
}
