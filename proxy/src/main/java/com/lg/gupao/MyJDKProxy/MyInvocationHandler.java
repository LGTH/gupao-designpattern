package com.lg.gupao.MyJDKProxy;

import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
