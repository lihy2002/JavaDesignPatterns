package priv.lhy;

import junit.framework.TestCase;
import priv.lhy.dynamic.BabySitter2Cglib;
import priv.lhy.dynamic.BabySitter2JDK;
import priv.lhy.staticProxy.BabySitter;
import priv.lhy.staticProxy.IPerson;
import priv.lhy.staticProxy.Master;
import priv.lhy.staticProxy.MasterNoImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author : lihy
 * date : 2018/3/31 11:04
 */
public class MasterTest extends TestCase {

    public void testStaticMaster() {
        new BabySitter(new Master("alex")).cleanUp();
        System.out.println("================================");
        new BabySitter(new Master("alex")).cook();
    }

    public void testJDKMaster() {
        IPerson master = new Master("alex");
        //创建一个InvocationHandler，选择代理者
        //InvocationHandler ih = new BabySitter2JDK(master);
        //通过刚才创建的InvocationHandler，创建真正的代理者。第一个参数是类加载器，第二个参数是这个代理者实现哪些接口(与被代理者实现的是相同的接口)
        //IPerson personProxy = (IPerson) Proxy.newProxyInstance(master.getClass().getClassLoader(), master.getClass().getInterfaces(), ih);

        IPerson personProxy = (IPerson) new BabySitter2JDK(master).getProxyInstance();
        System.out.println("生成的代理类：" + personProxy.getClass());
        personProxy.cook();
        System.out.println("================================");
        personProxy.cleanUp();


        System.out.println("================================");
        //这里可以通过运行结果证明personProxy是Proxy的一个实例，这个实例实现了代理接口
        System.out.println(personProxy instanceof Proxy);

        //这里可以看出personProxy的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了代理接口
        System.out.println("personProxy的Class类是："+personProxy.getClass().toString());

        System.out.print("personProxy中的属性有：");

        Field[] field=personProxy.getClass().getDeclaredFields();
        for(Field f:field){
            System.out.print(f.getName()+", ");
        }

        System.out.print("\n"+"personProxy中的方法有：");

        Method[] method=personProxy.getClass().getDeclaredMethods();

        for(Method m:method){
            System.out.print(m.getName()+", ");
        }

        System.out.println("\n"+"personProxy的父类是："+personProxy.getClass().getSuperclass());

        System.out.print("\n"+"personProxyt实现的接口是：");

        Class<?>[] interfaces=personProxy.getClass().getInterfaces();

        for(Class<?> i:interfaces){
            System.out.print(i.getName()+", ");
        }

    }

    public void testCglibMaster(){
        MasterNoImpl master = new MasterNoImpl("sun");

        MasterNoImpl personProxy = (MasterNoImpl) new BabySitter2Cglib(master).getProxyInstance();

        System.out.println("生成的代理类：" + personProxy.getClass());
        personProxy.cook();
        System.out.println("================================");
        personProxy.cleanUp();

        System.out.println("================================");

        //这里可以看出personProxy的Class类是MasterNoImpl$$...，父类是MasterNoImpl,
        // 这个MasterNoImpl$$...类作为master(被代理类)的子类，重写了代理方法
        System.out.println("personProxy的Class类是："+personProxy.getClass().toString());

        System.out.print("personProxy中的属性有：");

        Field[] field=personProxy.getClass().getDeclaredFields();
        for(Field f:field){
            System.out.print(f.getName()+", ");
        }

        System.out.print("\n"+"personProxy中的方法有：");

        Method[] method=personProxy.getClass().getDeclaredMethods();

        for(Method m:method){
            System.out.print(m.getName()+", ");
        }

        System.out.println("\n"+"personProxy的父类是："+personProxy.getClass().getSuperclass());

        System.out.print("\n"+"personProxyt实现的接口是：");

        Class<?>[] interfaces=personProxy.getClass().getInterfaces();

        for(Class<?> i:interfaces){
            System.out.print(i.getName()+", ");
        }
    }
}