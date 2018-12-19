package com.codegym.blogs.service;

import com.codegym.blogs.model.Blog;

public interface BlogService {
    Iterable<Blog> findAll();

    Blog findById (Long id);

    void save(Blog blog );

    void remove(Long id);
}
