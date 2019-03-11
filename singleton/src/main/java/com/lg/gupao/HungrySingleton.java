package com.lg.gupao;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class HungrySingleton  {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
