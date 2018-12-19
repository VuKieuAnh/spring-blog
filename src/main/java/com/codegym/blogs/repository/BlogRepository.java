package com.codegym.blogs.repository;

import com.codegym.blogs.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long >{
}
