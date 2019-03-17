package priv.lhy.observer.proxy;

import priv.lhy.observer.core.Event;
import priv.lhy.observer.mouse.MouseEvenCallback;
import priv.lhy.observer.mouse.MouseEventType;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * author : lihy
 * date : 2018/5/23 14:18
 * <p>
 * 监听者
 * 使用动态代理,可避免代码侵入
 */
public class MouseProxy implements InvocationHandler {

    //策略模式初始化对应关系
    private static Map<String, MouseEventType> methodMap = new HashMap<>();
    static {
        methodMap.put("onClick", MouseEventType.ON_CLICK);
        methodMap.put("onDoubleClick", MouseEventType.ON_DOUBLE_CLICK);
        methodMap.put("onDown", MouseEventType.ON_DOWN);
        methodMap.put("onUp", MouseEventType.ON_UP);
        methodMap.put("onMove", MouseEventType.ON_MOVE);
    }

    private IMouse target;

    public MouseProxy(IMouse target) {
        this.target = target;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态注册监听,注册以"on"开头的方法
        if (method.getName().startsWith("on")) {
            MouseEvenCallback callback = new MouseEvenCallback();
            Method callbackMethod = MouseEvenCallback.class.getMethod(method.getName(), Event.class);
            //MouseEventType type = MouseEventType.ON_CLICK;
            //策略模式，代替if-else
            MouseEventType type = methodMap.get(method.getName());
            /*if (method.getName().equals("onClick")) {
                type = MouseEventType.ON_CLICK;
            } else if (method.getName().equals("onDoubleClick")) {
                type = MouseEventType.ON_DOUBLE_CLICK;
            } else if (method.getName().equals("onDown")) {
                type = MouseEventType.ON_DOWN;
            } else if (method.getName().equals("onUp")) {
                type = MouseEventType.ON_UP;
            } else if (method.getName().equals("onMove")) {
                type = MouseEventType.ON_MOVE;
            }*/
            target.addListener(type, callback, callbackMethod);
            target.trigger(type);
        }
        Object obj = method.invoke(target, args);
        return obj;
    }
}
