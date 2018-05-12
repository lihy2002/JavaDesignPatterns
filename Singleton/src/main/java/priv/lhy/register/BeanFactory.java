package priv.lhy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author : lihy
 * date : 2018/3/21 15:08
 */
public class BeanFactory {

    private BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public synchronized static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            Object obj = null;

            try {
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
