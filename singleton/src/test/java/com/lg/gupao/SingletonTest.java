package com.lg.gupao;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName SingletonTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class SingletonTest {

    @Test
    public void testHungrySingleton() {
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h1);
        System.out.println(h2);
    }

    @Test
    public void testLazySingleton() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + LazySingleton.getInstance());
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + LazySingleton.getInstance());
            }
        };
        t1.start();
        t2.start();
    }

    @Test
    public void testInnerClassSingleton() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + InnerClassSingleton.getInstance());
            }
        };


        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + InnerClassSingleton.getInstance());
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSerialzableSingleton() {
        SerializableSingleton instance = SerializableSingleton.getInstance();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("SerialzableSingleton");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(instance);
            FileInputStream fileInputStream = new FileInputStream("SerialzableSingleton");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            SerializableSingleton obj = (SerializableSingleton)objectInputStream.readObject();
            System.out.println(instance);
            System.out.println(obj);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEnumSingleton() {
        Object instance1 = EnumSingleton.getInstance();
        Object instance2 = EnumSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testContainerSingleton() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                ContainerSingleton instance = (ContainerSingleton)ContainerSingleton.getInstance("com.lg.gupao.ContainerSingleton");
                System.out.println(instance);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                ContainerSingleton instance = (ContainerSingleton)ContainerSingleton.getInstance("com.lg.gupao.ContainerSingleton");
                System.out.println(instance);
            }
        });
        t1.start();
        t2.start();
    }

    @Test
    public void testThreadLocalSingleton() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
