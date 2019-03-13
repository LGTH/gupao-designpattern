package com.lg.gupao.prototype.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ClassName JsonToBeanUtil
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/
public class JsonToBeanUtil {
    public static  <T>T toBean(JSONObject json, Class<T> clazz) {

        Object obj = null;

        try {
            obj = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Object> entry : json.entrySet()) {
            try {
                BeanUtils.setProperty(obj, entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return (T)obj;
    }
}
