package com.rikkeiacademy.demo_springboot.repository;

import com.rikkeiacademy.demo_springboot.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findProductsByProName(String proName);
}
