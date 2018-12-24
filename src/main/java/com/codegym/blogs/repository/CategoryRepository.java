package com.codegym.blogs.repository;

import com.codegym.blogs.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
