package priv.lhy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author : lihy
 * date : 2018/5/11 9:08
 *
 * cglib代理
 * 也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展
 * 可代理没有实现接口的对象
 */
public class BabySitter2Cglib implements MethodInterceptor {

    private Object target;

    public BabySitter2Cglib(Object target) {
        this.target = target;
    }

    /**
     * 为目标对象创建代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建代理对象
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("保姆空闲中");
        //Object obj = method.invoke(target, objects);
        Object obj = methodProxy.invokeSuper(o, objects);
        if(method.getName().equals("cleanUp")){
            System.out.println("开始打扫");
        }else if(method.getName().equals("cook")){
            System.out.println("开始烧饭");
        }
        System.out.println("执行完成");
        return obj;
    }
}
