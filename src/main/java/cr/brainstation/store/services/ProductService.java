package cr.brainstation.store.services;

import cr.brainstation.store.dto.ProductDTO;
import cr.brainstation.store.models.Product;

import java.util.List;
import java.util.Optional;

public interface  ProductService {

    Optional<ProductDTO> findById(Long id);
    List<ProductDTO> getProductWithImage();
    List<Product> getProductList();
    Product create(Product product);



}
