package com.collections.services;

import com.collections.models.User;

import java.util.List;

/**
 * This interface describes user service class
 * @author Dmitro Zagrebenyev
 */
public interface UserService {
    // CRUD

    /**
     * The method creates new user
     * @param login String
     * @param password String
     * @param email String
     * @param phone String
     * @return user User
     */
    User create(String login, String password, String email, String phone);

    /**
     * The method reads user by login
     * @param login String
     * @return user User
     */
    User readByLogin(String login);
    User readByEmail(String email);
    User readByPhone(String phone);

    void update(User user, List<String> dataList);

    boolean delete(User user);


}
