package com.rikkeiacademy.demo_springboot.service;

import com.rikkeiacademy.demo_springboot.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer proId);
    Product insertProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Integer proId);
    List<Product> getProductByName(String proName);
}
