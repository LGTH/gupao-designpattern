package com.lg.gupao.prototype.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lg.gupao.prototype.bean.User;
import com.lg.gupao.prototype.service.UserService;
import com.lg.gupao.prototype.util.JsonToBeanUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/
public class UserController {

    UserService userService = new UserService();

    public String getUserByName(String name) {
        JSONObject result = new JSONObject();
        result.put("code", 1);
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        List<User> users = userService.selectByName(name);
        for (User user : users) {
            JSONObject tmp = new JSONObject();
            if (user.getName() != null) {
                tmp.put("name", user.getName());
            }
            if (user.getDescribe() != null) {
                tmp.put("describe", user.getDescribe());
            }
            if (user.getEmail() != null) {
                tmp.put("email", user.getEmail());
            }
            if (user.getId() != null) {
                tmp.put("id", user.getId());
            }
            if (user.getActivation() != null) {
                tmp.put("activation", user.getActivation());
            }
            if (user.getTelephone() != null) {
                tmp.put("telephone", user.getTelephone());
            }
            if (user.getLoginTimes() != null) {
                tmp.put("loginTimes", user.getLoginTimes());
            }
            if (user.getMainProject() != null) {
                tmp.put("mainProject", user.getMainProject());
            }
            //tmp.put("role",user.getRoleName());------------
            jsonObjects.add(tmp);
        }
        result.put("content", jsonObjects);
        return result.toJSONString();
    }

    //通过json实现的原型模式，简化手动拷贝复制代码
    public String getUserByNameUsePrototype(String name) {
        JSONObject result = new JSONObject();
        result.put("code", 1);
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        List<User> users = userService.selectByName(name);
        for (User user : users) {
//            JSONObject tmp = new JSONObject();
            JSONObject object = (JSONObject)JSON.toJSON(user);
            jsonObjects.add(object);
        }
        result.put("content", jsonObjects);
        return  result.toJSONString();
    }

    //利用BeanUtil实现user的拷贝
    public void addUser(String user) {
        JSONObject jObj = JSON.parseObject(user);

        User newUser = JsonToBeanUtil.toBean(jObj, User.class);

        System.out.println(newUser);
    }

}
