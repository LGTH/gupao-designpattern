package com.lg.gupao;

/**
 * @ClassName ThreadLocalSingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
