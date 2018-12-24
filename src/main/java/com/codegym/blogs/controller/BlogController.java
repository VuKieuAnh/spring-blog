package com.codegym.blogs.controller;

import com.codegym.blogs.model.Blog;
import com.codegym.blogs.model.Category;
import com.codegym.blogs.service.BlogService;
import com.codegym.blogs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

    @GetMapping(value = "")
    public ModelAndView index(){
        Iterable<Blog> listBlog = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/index","listBlog", listBlog);
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public ModelAndView createBlog(){
        ModelAndView modelAndView = new ModelAndView("blog/create", "blog", new Blog());
        return modelAndView;
    }

    @PostMapping(value = "/create")
    public ModelAndView createBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/create", "blog", new Blog());
        modelAndView.addObject("message", "Tạo mới thành công");
        return modelAndView;
    }
}
