package com.collections.models;

import java.util.Objects;

public class Blog {
    private static Integer id = 0;
    private User user;
    private String blogText;

    public Blog(User user, String blogText) {
        id++;
        this.user = user;
        this.blogText = blogText;
    }

    public static Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "user=" + user +
                ", blogText='" + blogText + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(user, blog.user) &&
                Objects.equals(blogText, blog.blogText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, blogText);
    }
}
