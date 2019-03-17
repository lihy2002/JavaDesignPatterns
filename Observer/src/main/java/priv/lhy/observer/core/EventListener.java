package priv.lhy.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * author : lihy
 * date : 2018/5/23 10:37
 *
 * 事件注册与监听
 */
public class EventListener implements IEventListener{

    //监听事件容器,保存所有监听事件
    Map<Enum, Event> events = new HashMap<>();

    /**
     * 注册事件
     * @param eventType
     * @param target
     * @param callbackMethod
     */
    public void addListener(Enum eventType, Object target, Method callbackMethod){
        Event event = new Event(target,callbackMethod);
        events.put(eventType, event);
    }

    /***
     * 实际触发
     * @param eventType
     */
    public void trigger(Enum eventType) {
        //不在监听队列中则放行
        if(!this.events.containsKey(eventType)) {return;}

        //在监听队列中则使用反射调用回调方法
        Event event = events.get(eventType);
        event.setSouce(this);
        event.setTime(new Date());
        System.out.println(event.toString());
        Method callback = event.getCallbackMethod();
        try {
            callback.invoke(event.getTarget(), event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
