package com.example.productservice.controller;

import com.example.productservice.logging.LogUserRequest;
import com.example.productservice.model.Product;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    @LogUserRequest
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/count")
    @LogUserRequest
    public Integer getCountOfProducts() {
        return productService.getCountOfProducts();
    }

    @PostMapping
    @LogUserRequest
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    @LogUserRequest
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
