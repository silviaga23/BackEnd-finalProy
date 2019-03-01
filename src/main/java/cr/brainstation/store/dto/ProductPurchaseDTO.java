package cr.brainstation.store.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import cr.brainstation.store.models.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ProductPurchase")
public class ProductPurchaseDTO implements Serializable {

    @Column(nullable = false, name ="quantity")
    private int quantity;
    @Id
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private ProductDTO product;
    @Id
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private PurchaseDTO purchase;


    public ProductPurchaseDTO(){
        super();
    }

    public ProductPurchaseDTO(int quantity, ProductDTO product, PurchaseDTO purchase) {
        this.quantity = quantity;
        this.product = product;
        this.purchase = purchase;
    }

    public ProductPurchaseDTO(int quantity, ProductDTO product) {
        this.quantity = quantity;
        this.product = product;
        this.purchase = purchase;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public PurchaseDTO getPurchase() {
        return purchase;
    }

    public void setPurchase(PurchaseDTO purchase) {
        this.purchase = purchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPurchaseDTO)) return false;
        ProductPurchaseDTO that = (ProductPurchaseDTO) o;
        return Objects.equals(product.getName(), that.product.getName()) &&
                Objects.equals(purchase.getId(), that.purchase.getId()) &&
                Objects.equals(getPurchase(), that.getPurchase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(product.getName(), purchase.getId(), getQuantity());
    }
}
