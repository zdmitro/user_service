package com.service.models;

public class Admin extends Entity {

    public Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public boolean isLogin(String message) {
        if (message.equals("admin")) {
            return true;
        }
        return false;
    }


}
