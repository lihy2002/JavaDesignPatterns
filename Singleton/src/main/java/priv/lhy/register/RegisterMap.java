package priv.lhy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author : lihy
 * date : 2018/3/21 14:53
 */
public class RegisterMap {
    private RegisterMap(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static RegisterMap getInstance(String name){
        if(null == name){
            name = RegisterMap.class.getName();
        }

        if(null == ioc.get(name)){
            ioc.put(name, new RegisterMap());
        }

        return (RegisterMap) ioc.get(name);
    }
}
