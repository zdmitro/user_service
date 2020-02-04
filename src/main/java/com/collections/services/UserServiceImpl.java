package com.collections.services;

import com.collections.dao.UserDAO;
import com.collections.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public User create(String login, String password, String email, String phone) {
        User user = new User(login, password, email, phone);
        this.userDAO.add(user);
        return user;
    }

    @Override
    public User readByLogin(String login) {

        try {
            return this.userDAO.getUserMap()
                    //This method points work with maps
                    .entrySet()
                    // We open stream to start process of collection iteration
                    .stream()
                    // This method filters the collection elements according to established criteria
                    .filter(e -> login.equals(e.getValue().getLogin()))
                    //When element is found, step out of iteration
                    .findFirst()
                    //We get this element,
                    .get()
                    //We get value of the element
                    .getValue();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User readByEmail(String email) {
        try {
            return this.userDAO.getUserMap()
                    //This method points work with maps
                    .entrySet()
                    // We open stream to start process of collection iteration
                    .stream()
                    // This method filters the collection elements according to established criteria
                    .filter(e -> email.equals(e.getValue().getEmail()))
                    //When element is found, step out of iteration
                    .findFirst()
                    //We get this element,
                    .get()
                    //We get value of the element
                    .getValue();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User readByPhone(String phone) {
        try {
            return this.userDAO.getUserMap()
                    //This method points work with maps
                    .entrySet()
                    // We open stream to start process of collection iteration
                    .stream()
                    // This method filters the collection elements according to established criteria
                    .filter(e -> phone.equals(e.getValue().getPhone()))
                    //When element is found, step out of iteration
                    .findFirst()
                    //We get this element,
                    .get()
                    //We get value of the element
                    .getValue();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User readById(Integer id) {
        try {
            return this.userDAO.getUserMap()
                    //This method points work with maps
                    .entrySet()
                    // We open stream to start process of collection iteration
                    .stream()
                    // This method filters the collection elements according to established criteria
                    .filter(e -> id.equals(e.getKey()))
                    //When element is found, step out of iteration
                    .findFirst()
                    //We get this element,
                    .get()
                    //We get value of the element
                    .getValue();

        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<User> readAllUsers() {
        return new ArrayList<>(this.userDAO.getUserMap()
                .values());
    }

    @Override
    public void update(User user, List<String> dataList) {
    }

    @Override
    public boolean deleteByUser(User user) {
        Integer key = 0;
        try {
            key = this.userDAO.getUserMap()
                    .entrySet()
                    .stream()
                    .filter(e -> user.equals(e.getValue()))
                    .findFirst()
                    .get()
                    .getKey();
        } catch (Exception e) {
            return false;
        }
        this.userDAO.getUserMap().remove(key);
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        try {
            this.userDAO.getUserMap().remove(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void printAllUsers() {
        this.userDAO.getUserMap()
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
