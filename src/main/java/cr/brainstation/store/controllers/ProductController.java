package cr.brainstation.store.controllers;

import cr.brainstation.store.dto.ProductDTO;
import cr.brainstation.store.models.Product;
import cr.brainstation.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    ProductService service;

/*    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll() {
        return new ResponseEntity<>(this.service.getProductList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> postProduct(@RequestBody ProductDTO product) {
        return new ResponseEntity<>(this.service.create(product), HttpStatus.OK);
    }*/

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(this.service.getProductList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody Product product) {
        return new ResponseEntity<>(this.service.create(product), HttpStatus.OK);
    }

}
