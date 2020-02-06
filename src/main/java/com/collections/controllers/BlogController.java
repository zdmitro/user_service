package com.collections.controllers;

import com.collections.models.Blog;
import com.collections.models.User;

import java.util.List;

public interface BlogController {

    Blog create(Integer userId, String text);

    // read by id, user, partial text, by Blog

    Blog readByID(Integer id);
    List<Blog> readByUser(User user);
    List<Blog> readByText(String partialText, User user);
    Blog readByBlog(Blog blog);

    // Update particular blog by a user

    Blog updateBlog(Blog blog, String newText);

    //Delete

    boolean deleteById(Integer id);
    boolean deleteByBlog(Blog blog);

}
