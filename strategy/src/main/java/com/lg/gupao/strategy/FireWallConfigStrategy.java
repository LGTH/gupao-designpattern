package com.lg.gupao.strategy;

/**
 * @ClassName FireWallConfigStrategy
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class FireWallConfigStrategy extends XMLConfig {
    @Override
    public boolean updateXML(String content) {
        System.out.println("更新防火墙策略成功");
        return true;
    }
}
