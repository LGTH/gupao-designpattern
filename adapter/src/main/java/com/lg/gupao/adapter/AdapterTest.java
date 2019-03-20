package com.lg.gupao.adapter;

/**
 * @ClassName AdapterTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class AdapterTest {
    public static void main(String[] args) {
        VM vm = new VMwareVM();
        vm.create(1, 2048, "linux", "centos6.7");

        VMAdapter vmAdapter = new VMAdapter();
        vmAdapter.create(2, 4096, "linux", "centos7.2", "openstack");
    }
}
