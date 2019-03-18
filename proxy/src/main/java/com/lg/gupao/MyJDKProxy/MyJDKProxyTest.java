package com.lg.gupao.MyJDKProxy;

import com.lg.gupao.JDKProxy.FindObject;
import com.lg.gupao.JDKProxy.Schoolmate;

/**
 * @ClassName MyJDKProxyTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class MyJDKProxyTest {
    public static void main(String[] args) {
        FindObject findObject = (FindObject) new MyMeiPo().getInstance(new Schoolmate());
        System.out.println(findObject);
        findObject.findLove();
    }
}
