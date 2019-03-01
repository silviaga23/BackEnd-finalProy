package cr.brainstation.store.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ProductImage")
public class ProductImageDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_id", nullable = false)
    @JsonBackReference
    private ProductDTO product;

    public ProductImageDTO(){
        super();
    }
    public ProductImageDTO(String url,ProductDTO product) {
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

/*    public ProductDTO getProduct() {
        return product;
    }*/

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}

