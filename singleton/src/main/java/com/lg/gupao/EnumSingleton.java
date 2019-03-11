package com.lg.gupao;

import java.io.Serializable;

/**
 * @ClassName EnumSingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public enum  EnumSingleton  {
    INSTANCE;

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public static Object getInstance() {
        return INSTANCE;
    }
}
