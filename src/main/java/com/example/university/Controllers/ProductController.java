package com.example.university.Controllers;

import com.example.university.ProductService.ProductService;
import com.example.university.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products=productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id)
            .map(product->ResponseEntity.ok(product))
            .orElse(ResponseEntity.notFound().build());
    }
}
