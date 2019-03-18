package com.lg.gupao.MyJDKProxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ClassName MyProxy
 * @Auther: LG
 * @Description
 * @Date 2019/3/16
 **/
public class MyProxy implements MyInvocationHandler {

    private static String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader, Class<?> []interfaces, MyInvocationHandler h) {
        try {
            String src =  generateSrc(interfaces);
            String filepath =  MyProxy.class.getResource("").getPath();
            System.out.println(filepath);
            File f = new File(filepath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager =  jc.getStandardFileManager(null, null, null);
            Iterable iterable =  manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = jc.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c =  proxyClass.getConstructor(MyInvocationHandler.class);
            f.delete();

            return c.newInstance(h);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.lg.gupao.MyJDKProxy;" + ln);
        sb.append("import com.lg.gupao.JDKProxy.FindObject;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + " {" + ln);
        sb.append("MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h) {" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType() + " " + m.getName() + "() {"+ ln);
            sb.append("try {" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("this.h.invoke(this, m, null); " + ln);
            sb.append("}catch (Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);
            sb.append("}" + ln);
        }
        sb.append("}" + ln);
        sb.append("" + ln);
        System.out.println(sb);
        return sb.toString();
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
