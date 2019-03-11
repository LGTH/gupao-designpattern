package com.lg.gupao;

import java.io.Serializable;

/**
 * @ClassName SerializableSingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class SerializableSingleton implements Serializable {

    private static final  SerializableSingleton serializableSingleton = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance() {
        return serializableSingleton;
    }

    private Object readResolve(){
        return serializableSingleton;
    }
}
