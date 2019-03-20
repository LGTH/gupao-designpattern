package com.lg.gupao.strategy;

/**
 * @ClassName XMLConfigFactory
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class XMLConfigFactory {

    public XMLConfig getUpdateConfig(String type) {
        XMLConfig xmlConfig = null;
        if (type.equalsIgnoreCase("process")) {
            xmlConfig = new ProcessConfigStrategy();
            xmlConfig.init("update", "进程",  "C:/process.xml");
            return xmlConfig;
        } else if (type.equalsIgnoreCase("firewall")) {
            xmlConfig = new FireWallConfigStrategy();
            xmlConfig.init("update", "防火墙",  "C:/firewall.xml");
            return xmlConfig;
        }
        return xmlConfig;
    }

}
