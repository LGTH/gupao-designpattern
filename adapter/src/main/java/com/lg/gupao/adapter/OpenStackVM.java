package com.lg.gupao.adapter;

/**
 * @ClassName OpenStackVM
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class OpenStackVM implements VM {
    @Override
    public void create(int cpu, int memory, String os, String version) {
        System.out.println("创建OpenStackVM虚拟机: ");
        System.out.println("配置为: cpu:" + cpu + "  memory:" + memory +  " os:" + os + "version: " + version);
    }
}
