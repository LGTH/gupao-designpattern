package com.lg.gupao.strategy;

/**
 * @ClassName StrategyTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class StrategyTest {
    public static void main(String[] args) {
        XMLConfigFactory xmlConfigFactory = new XMLConfigFactory();
        XMLConfig xmlConfig = xmlConfigFactory.getUpdateConfig("process");
        xmlConfig.updateXML("<process>C:/abc.exe</processs>");
        xmlConfig.writeToFile();

        xmlConfig = xmlConfigFactory.getUpdateConfig("firewall");
        xmlConfig.updateXML("<firewall port=3000 switch=\"off\"></firewall>");
        xmlConfig.writeToFile();

    }
}
