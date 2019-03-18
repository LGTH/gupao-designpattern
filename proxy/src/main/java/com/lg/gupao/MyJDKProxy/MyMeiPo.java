package com.lg.gupao.MyJDKProxy;

import com.lg.gupao.JDKProxy.FindObject;

import java.lang.reflect.Method;

/**
 * @ClassName MyMeiPo
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class MyMeiPo implements MyInvocationHandler {

    private Object target;

    public Object getInstance(FindObject findObject) {
        this.target = findObject;
        Class<?> clazz =  target.getClass();

        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        Object obj = method.invoke(this.target, args);

        after();

        return obj;
    }

    private void before() {
        System.out.println("欢迎光临");
    }

    private void after() {
        System.out.println("再见");
    }
}
