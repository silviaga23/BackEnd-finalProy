package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;

public class ProductPurchase {

    @NotNull
    private int quantity;
    @NotNull
    private Product product;

    private Purchase purchase;

    public ProductPurchase(){
        super();
    }

    public ProductPurchase(@NotNull int quantity, @NotNull Product product, Purchase purchase) {
        this.quantity = quantity;
        this.product = product;
        this.purchase = purchase;
    }
    public ProductPurchase(@NotNull int quantity, @NotNull Product product) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
