package com.collections;

import com.collections.controllers.BlogControllerImpl;
import com.collections.controllers.UserControllerImpl;

public class Main {
    public static void main(String[] args) {

        UserControllerImpl userController = new UserControllerImpl();
        BlogControllerImpl blogController = new BlogControllerImpl();


        userController.create("zdmitro", "1234567", "zdmitro@gmail.com", "240-626-6427");
        userController.create("dzagrebenyev", "get567", "dzagregget@gmail.com", "240-111-2222");
        userController.create("dz2008", "123abcd", "myEmail@gmail.com", "240-333-4444");
        userController.create("4thElement", "123a&$#", "newwEmail@gmail.com", "240-444-5555");

//        blogController.create(0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        blogController.create(0, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//        blogController.create(0, "ccccccccccccccccccccccccccccccccccccccccccccccc");
//        blogController.create(1, "aaaaaaaaaaddddddddddddddddd");


        userController.printAllUsers();
        System.out.println();

//        userController.deleteById(2);
//        userController.deleteById(3);

        userController.create("NewElement", "123a666&$#", "newwE6mail@gmail.com", "240-444-6666");

        userController.printAllUsers();

        blogController.printAllBlogs();
    }
}
