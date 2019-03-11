package com.lg.gupao;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class ContainerSingleton  {

    private static   Map<String, Object> map = new ConcurrentHashMap<>();

    private ContainerSingleton() {

    }

    public static Object getInstance(String className) {
        synchronized (map) {
            if (!map.containsKey(className)) {
                try {
                    Object object = null;
                    try {
                        object = Class.forName(className).newInstance();
                        map.put(className, object);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return object;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return map.get(className);
    }
}
