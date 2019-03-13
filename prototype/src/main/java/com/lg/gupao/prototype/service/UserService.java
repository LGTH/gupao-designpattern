package com.lg.gupao.prototype.service;

import com.lg.gupao.prototype.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserService
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/
public class UserService {

    public List<User> selectByName(String name) {
        List<User> result = new ArrayList<>();

        User user1 = new User();
        user1.setName(name);
        user1.setId("1");

        User user2 = new User();
        user2.setName(name);
        user2.setId("2");

        result.add(user1);
        result.add(user2);
        return result;
    }
}
