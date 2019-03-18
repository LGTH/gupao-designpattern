package com.lg.gupao.JDKProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JDKProxy
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class JDKProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object object) {
        this.target = object;
        Class<?> clazz = object.getClass();
        return  Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("请问有什么可以帮到你？");
    }

    private void after() {
        System.out.println("好的，马上帮你找");
    }

}
