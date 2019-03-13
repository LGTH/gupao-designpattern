package com.lg.gupao.prototype;

import com.lg.gupao.prototype.controller.UserController;

import java.io.ObjectInputStream;

/**
 * @ClassName app
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/
public class app {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Object object = userController.getUserByName("tom");
        System.out.println(object);
    }
}
