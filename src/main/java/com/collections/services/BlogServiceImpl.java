package com.collections.services;

import com.collections.dao.BlogDAO;
import com.collections.dao.UserDAO;
import com.collections.models.Blog;
import com.collections.models.User;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BlogServiceImpl implements BlogService {

    private BlogDAO blogDAO = new BlogDAO();
    private UserDAO userDAO = new UserDAO();

    @Override
    public Blog create(Integer userId, String text) {
        User user = Objects.requireNonNull(this.userDAO.getUserMap()
                .entrySet()
                .stream()
                .filter(e -> userId.equals(e.getKey()))
                .findFirst()
                .orElse(null))
                .getValue();

        if (user != null) {
            Blog blog = new Blog(user, text);
            this.blogDAO.add(blog);
            return blog;
        }
        return null;
    }

    @Override
    public Blog readByID(Integer id) {
       return this.blogDAO.getBlogList()
                .stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Blog> readByUser(User user) {
        return this.blogDAO.getBlogList()
                .stream()
                .filter(e -> user.equals(e.getUser()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Blog> readByText(String partialText, User user) {
        return this.blogDAO.getBlogList()
                .stream()
                .filter(e -> user.equals(e.getUser()) && partialText.equals(e.getBlogText()))
                .collect(Collectors.toList());
    }

    @Override
    public Blog readByBlog(Blog blog) {
        return this.blogDAO.getBlogList()
                .stream()
                .filter(blog::equals)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Blog updateBlog(Blog blog, String newText) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        Blog blog = this.blogDAO.getBlogList()
                .stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .orElse(null);
        if (blog == null) {
            return false;
        } else {
            return this.blogDAO.getBlogList().remove(blog);
        }
    }

    @Override
    public boolean deleteByBlog(Blog blog) {
        return this.blogDAO.getBlogList().remove(blog);
    }

    public void printAllBlogs() {
        this.blogDAO.getBlogList().forEach(System.out::println);
    }
}
