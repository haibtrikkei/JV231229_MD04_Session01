package com.rikkeiacademy.demo_springboot.repository;

import com.rikkeiacademy.demo_springboot.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
