package com.lg.gupao.strategy;

/**
 * @ClassName XMLConfig
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class XMLConfig implements UpdateXMLConfig {
    protected String operate;
    protected String monitorType;
    protected String cfgPathPrefix;
    protected String cfgFile;

    public void init(String operate, String monitorType, String cfgFile) {
        operate = operate;
        monitorType = monitorType;
        cfgFile = cfgFile;
    }

    @Override
    public boolean updateXML(String content) {
        return false;
    }

    public void writeToFile() {
        System.out.println("写入【" + cfgFile + "】成功");
    }


}
