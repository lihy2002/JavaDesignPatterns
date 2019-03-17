package priv.lhy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册登记式单例，每使用一次都会向一个固定的容器中去注册并且将使用过的对象进行缓存，
 * 第二次去取对象的时候就直接从缓存中取值，以保证每次获取的都是同一个对象
 * 线程不安全
 * author : lihy
 * date : 2018/3/21 14:53
 */
public class RegisterMap {
    private RegisterMap(){}

    //ConcurrentHashMap本身是线程安全的，但是并不能保证操作值安全
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    //在多线程中需要增加synchronized保证线程安全
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
