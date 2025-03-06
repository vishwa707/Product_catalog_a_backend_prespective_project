package com.jap.restdemo.service;

import com.jap.restdemo.domain.Product;
import com.jap.restdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product); // Return type is Product
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Return type is List<Product>
    }

    @Override
    public boolean deleteProduct(Integer productId) {
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
            return true; // Return type is boolean
        } else {
            return false;
        }
    }
}
