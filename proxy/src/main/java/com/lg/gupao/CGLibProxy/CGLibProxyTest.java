package com.lg.gupao.CGLibProxy;

/**
 * @ClassName CGLibProxyTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/18
 **/
public class CGLibProxyTest {
    public static void main(String[] args) {
        try {
            Customer customer = (Customer) new CGLibProxy().getInstance(Customer.class);
            customer.findObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
