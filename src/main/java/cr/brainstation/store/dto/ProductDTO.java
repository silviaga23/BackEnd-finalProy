package cr.brainstation.store.dto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import cr.brainstation.store.models.Category;
import cr.brainstation.store.models.ProductImage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Product")
public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String serie;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(length = 1000)
    private String feature;
    @Column(length = 1000)
    private String specification;
    @Column(nullable = false)
    private String brand;
    @Column(length = 1000)
    private String description;
    @Column(nullable = false)
    private String label;
    @Column(nullable = false)
    private String sound;
    @Column(nullable = false)
    private String video;
    private int stock;
    @JsonManagedReference
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<ProductImageDTO> images;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="products_category"
        ,joinColumns = @JoinColumn(name = "product_id")
        ,inverseJoinColumns = @JoinColumn(name = "category_id" )
    )
    @JsonManagedReference
    private List<CategoryDTO> categories;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<ProductPurchaseDTO> productPurchase;

    public ProductDTO(){
        super();
    }

    public ProductDTO(String serie, String name, double price,String feature, String specification, String brand, String description,String label,  String sound, String video, int stock) {
        this.serie = serie;
        this.name = name;
        this.price = price;
        this.feature = feature;
        this.specification = specification;
        this.brand = brand;
        this.description = description;
        this.label = label;
        this.sound = sound;
        this.video = video;
        this.stock = stock;
        this.categories = new ArrayList<>();
        this.images = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public String getSerie() {
        return serie;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFeature() {
        return feature;
    }

    public String getSpecification() {
        return specification;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }

    public String getSound() {
        return sound;
    }

    public String getVideo() {
        return video;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public void addCategory(CategoryDTO category){
        this.categories.add(category);
    }

    public void addImage(ProductImageDTO productImage){
        this.images.add(productImage);
    }

    public Set<ProductImageDTO> getImages() {
        return images;
    }

    public void setImages(Set<ProductImageDTO> images) {
        this.images = images;
    }
}
