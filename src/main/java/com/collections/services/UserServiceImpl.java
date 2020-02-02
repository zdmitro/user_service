package com.collections.services;

import com.collections.dao.UserDAO;
import com.collections.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public User create(String login, String password, String email, String phone) {
        User user = new User(login, password, email, phone);
        this.userDAO.add(user);
        return user;
    }

    public List<User> readAll() {
        return null;
    }

    @Override
    public User readByLogin(String login) {
        return this.userDAO.getUserMap()
                .entrySet()
                .stream()
                .filter(e -> e.getValue().getLogin().equals(login))
                .findFirst()
                .get()
                .getValue();
    }

    @Override
    public User readByEmail(String email) {
        return null;
    }

    @Override
    public User readByPhone(String phone) {
        return null;
    }

    public User readById(int id) {
        return null;
    }

    @Override
    public void update(User user, List<String> dataList) {

    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
