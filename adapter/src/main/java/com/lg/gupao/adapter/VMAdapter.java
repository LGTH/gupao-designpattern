package com.lg.gupao.adapter;

/**
 * @ClassName VMAdapter
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class VMAdapter {

    private OpenStackVM  openStackVM = new OpenStackVM();
    private VMwareVM defualtVM = new  VMwareVM();

    public void create(int cpu, int memory, String os, String version, String type) {
        if (type.equalsIgnoreCase("openStack")) {
            openStackVM.create(cpu, memory, os, version);
        } else {
            defualtVM.create(cpu, memory, os, version);
        }
    }
}
