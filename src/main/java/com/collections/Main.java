package com.collections;

import com.collections.models.User;
import com.collections.services.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.create("zdmitro", "1234567", "zdmitro@gmail.com", "240-626-6427");
        userService.create("dzagrebenyev", "get567", "dzagregget@gmail.com", "240-111-2222");
        userService.create("dz2008", "123abcd", "myEmail@gmail.com", "240-333-4444");

        System.out.println(userService.readByLogin("dz2009"));

    }
}
