package com.example.productservice.service;

import com.example.productservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Integer getCountOfProducts();
    Product createProduct(Product product);
    Product getProductById(Long id);
}
