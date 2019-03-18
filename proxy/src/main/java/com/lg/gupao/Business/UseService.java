package com.lg.gupao.Business;


import java.sql.Timestamp;
import java.util.List;

public interface UseService {
    String selectByName(String name);
    String register();
    String logout();
}
