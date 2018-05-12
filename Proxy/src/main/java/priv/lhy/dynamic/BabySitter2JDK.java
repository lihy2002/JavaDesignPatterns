package priv.lhy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author : lihy
 * date : 2018/3/31 11:11
 * <p>
 * 动态代理
 * 不需要实现代理对象接口
 * 代理对象是利用JDK的API动态在内存中构建的（指定创建代理对象/目标对象实现的接口类型）
 * 也叫作JDK代理，接口代理
 * 缺点：目标对象一定要实现接口
 */
public class BabySitter2JDK implements InvocationHandler {

    //代理对象的实例
    private Object target;

    public BabySitter2JDK(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        System.out.println("被代理的对象：" + target.getClass());
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象:" + proxy.getClass());
        System.out.println("保姆空闲中");
        Object obj = method.invoke(target, args);
        System.out.println("执行完成");
        return obj;
    }
}
