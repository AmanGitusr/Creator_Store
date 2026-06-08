package meow.at.creatorstore.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import meow.at.creatorstore.entities.Product;
import meow.at.creatorstore.services.ProductService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @GetMapping
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
