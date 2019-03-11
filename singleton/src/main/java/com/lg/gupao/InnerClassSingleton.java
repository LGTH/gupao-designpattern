package com.lg.gupao;

/**
 * @ClassName InnerClassSingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class InnerClassSingleton {

    private InnerClassSingleton() {
        if(InnerClass.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static  InnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static  InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
