package com.lg.gupao;

import com.lg.gupao.JDKProxy.FindObject;
import com.lg.gupao.JDKProxy.JDKProxy;
import com.lg.gupao.JDKProxy.Schoolmate;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName JDKProxyTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class JDKProxyTest {

    @Test
    public void testJDKPrFoxy() {
        JDKProxy jdkProxy = new JDKProxy();
        Schoolmate schoolmate = new Schoolmate();
        FindObject findObject = (FindObject) jdkProxy.getInstance(schoolmate);
        findObject.findLove();
    }
}
