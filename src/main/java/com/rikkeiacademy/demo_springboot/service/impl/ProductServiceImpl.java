package com.rikkeiacademy.demo_springboot.service.impl;

import com.rikkeiacademy.demo_springboot.model.entity.Product;
import com.rikkeiacademy.demo_springboot.repository.ProductRepository;
import com.rikkeiacademy.demo_springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer proId) {
        return productRepository.findById(proId).orElseThrow(()->new NoSuchElementException("Khong ton tai san pham to ma "+proId));
    }

    @Override
    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        productRepository.findById(product.getProId()).orElseThrow(()->new NoSuchElementException("Khong ton tai san pham nay trong database"));
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer proId) {
        productRepository.deleteById(proId);
    }

    @Override
    public List<Product> getProductByName(String proName) {
        return productRepository.findProductsByProName(proName);
    }
}
