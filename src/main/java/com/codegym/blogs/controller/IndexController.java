package com.codegym.blogs.controller;

import com.codegym.blogs.model.Blog;
import com.codegym.blogs.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    BlogService blogService;

    @GetMapping(value = "/index")
    public ModelAndView index(){
        Iterable<Blog> listBlog = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("index","listBlog", listBlog);
        return modelAndView;
    }

}
