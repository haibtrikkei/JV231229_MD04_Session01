package com.rikkeiacademy.demo_springboot.service;

import com.rikkeiacademy.demo_springboot.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
}
