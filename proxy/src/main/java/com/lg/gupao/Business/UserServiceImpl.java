package com.lg.gupao.Business;


import java.sql.Timestamp;
import java.util.List;

public class UserServiceImpl implements UseService {

    @Override
    public String  selectByName(String name) {
        if (name.equalsIgnoreCase("admin")) {
            return "admin";
        }
        return null;
    }

    public String register() {
        return "0";
    }

    public  String logout() {
        return "0";
    }
}
