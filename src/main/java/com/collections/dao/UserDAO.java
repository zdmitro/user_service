package com.collections.dao;

import com.collections.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private Map<Integer, User> userMap;
    private static Integer index = 0;

    public UserDAO() {
        userMap = new HashMap<>();
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void add(User user) {
        userMap.put(index++, user);
    }
}
