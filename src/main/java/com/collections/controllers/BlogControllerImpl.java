package com.collections.controllers;

import com.collections.models.Blog;
import com.collections.models.User;
import com.collections.services.BlogService;
import com.collections.services.BlogServiceImpl;

import java.util.List;

public class BlogControllerImpl implements BlogController {

    private BlogServiceImpl blogService = new BlogServiceImpl();


    @Override
    public Blog create(Integer userId, String text) {
        return this.blogService.create(userId, text);
    }

    @Override
    public Blog readByID(Integer id) {
        return this.blogService.readByID(id);
    }

    @Override
    public List<Blog> readByUser(User user) {
        return this.blogService.readByUser(user);
    }

    @Override
    public List<Blog> readByText(String partialText, User user) {
        return this.blogService.readByText(partialText, user);
    }

    @Override
    public Blog readByBlog(Blog blog) {
        return this.blogService.readByBlog(blog);
    }

    @Override
    public Blog updateBlog(Blog blog, String newText) {
        return this.blogService.updateBlog(blog, newText);
    }

    @Override
    public boolean deleteById(Integer id) {
        return this.blogService.deleteById(id);
    }

    @Override
    public boolean deleteByBlog(Blog blog) {
        return this.blogService.deleteByBlog(blog);
    }

    public void printAllBlogs() {
        this.blogService.printAllBlogs();
    }
}
