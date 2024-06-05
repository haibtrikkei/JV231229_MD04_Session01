package com.rikkeiacademy.demo_springboot.service.impl;

import com.rikkeiacademy.demo_springboot.model.entity.Category;
import com.rikkeiacademy.demo_springboot.repository.CategoryRepository;
import com.rikkeiacademy.demo_springboot.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
