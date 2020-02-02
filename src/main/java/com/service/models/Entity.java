package com.service.models;

public abstract class Entity {
    private String login;
    private String password;

    public Entity(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //This is our abstract method without body
    public abstract boolean isLogin(String message);

    //This is regular method with body
    public void printData() {
        System.out.println(this.login + " " + this.password);
    }
}
