package com.collections.controllers;

import com.collections.models.User;
import com.collections.services.UserServiceImpl;

import java.util.List;

public class UserControllerImpl implements UserController {

    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    public User create(String login, String password, String email, String phone) {
        return this.userService.create(login, password, email, phone);
    }

    @Override
    public User readByLogin(String login) {
        return this.userService.readByLogin(login);
    }

    @Override
    public User readByEmail(String email) {
        return this.userService.readByEmail(email);
    }

    @Override
    public User readById(Integer id) {
        return this.userService.readById(id);
    }

    @Override
    public List<User> readAllUsers() {
        return this.userService.readAllUsers();
    }

    @Override
    public User readByPhone(String phone) {
        return this.userService.readByPhone(phone);
    }

    @Override
    public void update(User user, List<String> dataList) {
        this.userService.update(user, dataList);
    }

    @Override
    public boolean deleteByUser(User user) {
        return this.userService.deleteByUser(user);
    }

    @Override
    public boolean deleteById(Integer id) {
        return this.userService.deleteById(id);
    }

    @Override
    public void printAllUsers() {
        this.userService.printAllUsers();
    }
}
