package com.lg.gupao.Business;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName MyProxy
 * @Auther: LG
 * @Description
 * @Date 2019/3/18
 **/
public class MyProxy implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before(method, objects);
        Object result = methodProxy.invokeSuper(o, objects);
        after(method, result, objects);
        return result;
    }

    private void before(Method method, Object[] objects) {
        System.out.println("记录监听到API访问接口:" + method.getName());
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("监听到用户登录:\r\n 用户名：" + objects[0]);
        }
    }

    private void after(Method method, Object  result, Object[] objects) {
        if (method.getName().equalsIgnoreCase("login")) {
            if ("0".equalsIgnoreCase((String)result)) {
                System.out.println("用户: " + objects[0] + " 登录成功");
            }
        }
    }
}
