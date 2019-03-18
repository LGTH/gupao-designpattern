package com.lg.gupao.Business;

/**
 * @ClassName BusinessTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/18
 **/
public class BusinessTest {
    public static void main(String[] args) {
        try {
            LoginController loginController = (LoginController) new MyProxy().getInstance(LoginController.class);
            loginController.login("admin", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
