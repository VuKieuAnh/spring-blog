package com.codegym.blogs.service;

import com.codegym.blogs.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById (Long id);

    void save(Category category );

    void remove(Long id);
}
