package cr.brainstation.store.repository;

import cr.brainstation.store.dto.ProductDTO;
import cr.brainstation.store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface IProductRepository extends JpaRepository<ProductDTO, Long> {

    public List<ProductDTO> findByImages(ProductDTO product);
}
