package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;

public class ProductImage {

    @NotNull
    private int id;
    @NotNull
    private String url;
    @NotNull
    private Product product;

    public ProductImage(){
        super();
    }
    public ProductImage(@NotNull String url, @NotNull Product product) {
        this.id = id;
        this.url = url;
        this.product = product;
    }

    public ProductImage(@NotNull int id, @NotNull String url, @NotNull Product product) {
        this.id = id;
        this.url = url;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
