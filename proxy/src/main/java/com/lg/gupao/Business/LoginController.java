package com.lg.gupao.Business;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//import com.zjft.ZJCMPManagerCenter.config.JedisConnectConfig;

//import com.zjft.ZJCMPManagerCenter.service.RedisService;

public class LoginController {


    private UseService userService = null;

    public LoginController() {
        try {
            userService = (UseService) new MyProxy().getInstance(UserServiceImpl.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String login(String name, String password) {
        String admin = userService.selectByName(name);
        if (admin != null && admin.equalsIgnoreCase(password)) {
            return "0";
        }
        return "-1";
    }

    public String register() {
        return "0";
    }

    public  String logout() {
        return "0";
    }
}
