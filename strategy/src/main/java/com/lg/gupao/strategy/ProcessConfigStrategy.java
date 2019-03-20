package com.lg.gupao.strategy;

/**
 * @ClassName ProcessConfigStrategy
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class ProcessConfigStrategy extends XMLConfig  {
    @Override
    public boolean updateXML(String content) {
        System.out.println("更新进程策略成功");
        return super.updateXML(content);
    }
}
