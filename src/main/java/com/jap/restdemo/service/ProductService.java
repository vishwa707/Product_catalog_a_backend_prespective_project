package com.jap.restdemo.service;

import com.jap.restdemo.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    boolean deleteProduct(Integer productId);
}
