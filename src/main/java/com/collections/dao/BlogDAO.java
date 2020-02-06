package com.collections.dao;

import com.collections.models.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogDAO {

    private List<Blog> blogList;

    //sozdaem constructor
    public BlogDAO() {
        this.blogList = new ArrayList<>();
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void add(Blog blog) {
        this.blogList.add(blog);
    }
}
