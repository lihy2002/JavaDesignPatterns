package priv.lhy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例工厂，使用注册式单例，需要注意线程安全问题
 * author : lihy
 * date : 2018/3/21 15:08
 */
public class BeanFactory {

    private BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    //在多线程中需要增加synchronized保证线程安全
    public synchronized static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            Object obj = null;

            try {
                //根据传入的类名生成实例
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else {
            return ioc.get(className);

        }
    }
}
