package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


public class Category {


    private int id;
    @NotNull
    private String name;
    private String description;
    private List<Product> products;

    public Category(){
        super();
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

}