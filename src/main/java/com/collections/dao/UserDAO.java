package com.collections.dao;

import com.collections.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private static int index = 0;
    private Map<Integer, User> userMap;

    public UserDAO() {
        this.userMap = new HashMap<>();
    }

    public Map<Integer, User> getUserMap() {
        return this.userMap;
    }

    public void add(User user) {
        this.userMap.put(index++, user);
    }
}
