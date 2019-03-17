package priv.lhy.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * author : lihy
 * date : 2018/5/23 15:33
 *
 * 事件注册监听接口
 */
public interface IEventListener {

    Map<Enum, Event> events= new HashMap<>();

    public void addListener(Enum eventType, Object target, Method callbackMethod);

    public void trigger(Enum eventType);
}
