package com.lg.gupao.JDKProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Test
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class Test {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        Schoolmate schoolmate = new Schoolmate();
        FindObject findObject = (FindObject) jdkProxy.getInstance(schoolmate);
        findObject.findLove();
    }
}
