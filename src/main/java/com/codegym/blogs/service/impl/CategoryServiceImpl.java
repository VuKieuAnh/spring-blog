package com.codegym.blogs.service.impl;

import com.codegym.blogs.model.Category;
import com.codegym.blogs.repository.CategoryRepository;
import com.codegym.blogs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.delete(id);
    }
}
