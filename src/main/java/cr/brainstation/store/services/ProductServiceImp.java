package cr.brainstation.store.services;

import cr.brainstation.store.dto.ProductDTO;
import cr.brainstation.store.models.Product;
import cr.brainstation.store.repository.IProductRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    private IProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    ProductServiceImp(IProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional()
    public Product create(Product product) {

        ProductDTO dto = modelMapper.map(product, ProductDTO.class);

        if(!product.getName().equals("")){
            ProductDTO dtoResult = productRepository.save(dto);
            Product prod = modelMapper.map(dtoResult, Product.class);
            return prod;
        }else{
            return null;
        }
    }

    @Override
    public List<Product> getProductList() {

        Type listType = new TypeToken<List<Product>>() {}.getType();
        List<ProductDTO> list = productRepository.findAll();
        List<Product> listProduct = modelMapper.map(list, listType);
        list.size();
        return listProduct;
    }


    @Override
    public List<ProductDTO> getProductWithImage() {
        return null;
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        return Optional.empty();
    }



}
