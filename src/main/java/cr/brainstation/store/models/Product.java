package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Product {

    private long id;
    @NotNull
    private String serie;
    @NotNull
    private String name;
    @NotNull
    private double price;
    private String feature;
    private String specification;
    @NotNull
    private String brand;
    @NotNull
    private String description;
    @NotNull
    private String label;
    @NotNull
    private String sound;
    @NotNull
    private String video;
    private int stock;

    @NotNull
    private List<ProductImage> images;

    private List<Category> categories;

    private Set<ProductPurchase> productPurchase;

    public Product(){
        super();
    }

    public Product(long id, @NotNull String serie, @NotNull String name, @NotNull double price, String feature, String specification, @NotNull String brand, @NotNull String description, @NotNull String label, @NotNull String sound, @NotNull String video, int stock, @NotNull List<ProductImage> images, List<Category> categories, Set<ProductPurchase> productPurchase) {
        this.id = id;
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
        this.images = images;
        this.categories = categories;
        this.productPurchase = productPurchase;
    }

    public Product(@NotNull String serie, @NotNull String name, @NotNull double price, String feature, String specification, @NotNull String brand, @NotNull String description, @NotNull String label, @NotNull String sound, @NotNull String video, int stock) {
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
        this.images = new ArrayList<>();
        this.productPurchase = new HashSet<>();

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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category){
        this.categories.add(category);
    }

    public void addImage(ProductImage productImage){
        this.images.add(productImage);
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    public Set<ProductPurchase> getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(Set<ProductPurchase> productPurchase) {
        this.productPurchase = productPurchase;
    }

}
