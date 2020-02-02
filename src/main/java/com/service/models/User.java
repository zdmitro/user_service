package com.service.models;

public class User extends Entity {


    public User(String login, String password) {
        super(login, password);
    }

    @Override
    public boolean isLogin(String message) {
        System.out.println(message);
        if (message.equals("users")) {
            return true;
        }
        System.out.println("authorization failed");
        return false;
    }
}
