package priv.lhy.reflect;

import junit.framework.TestCase;
import priv.lhy.entity.Hanmeimei;
import priv.lhy.entity.IPersion;
import priv.lhy.entity.Lilee;
import priv.lhy.entity.Student;

import java.lang.reflect.*;

/**
 * author : lihy
 * date : 2018/4/9 16:39
 */
public class ReflectDemoTest extends TestCase {

    public void testReflect() {

        Hanmeimei hanmeimei = new Hanmeimei("hmm", "female", 20);
        Lilee lilee = new Lilee("lilee", "male", 24, hanmeimei);
        hanmeimei.setBoyfriend(lilee);

        //三种获取Class方法
        //1、类全路径    Class.forName()
        //2、类名        clazz.Class
        //3、对象        object.getClass();
        //ReflectDemo demo = new ReflectDemo("priv.lhy.entity.Lilee");
        //ReflectDemo demo = new ReflectDemo(Lilee.class);
        ReflectDemo demo = new ReflectDemo(lilee);
        Class clazz = demo.getClazz();
        /*System.out.println(clazz.getName());
        System.out.println(clazz.getSuperclass().getName());*/

        //可获取私有方法，不能获取父类方法
        /*for(Method m:clazz.getDeclaredMethods()){
            System.out.println(clazz.getName()+"方法："+m.getName());
        }*/

        //不能获取私有方法，可获取父类方法
        /*for(Method m:clazz.getMethods()){
            System.out.println(clazz.getName()+"方法："+m.getName());
        }*/
        //不能获取私有属性，可获取父类属性
        //Field[] fields = clazz.getFields();
        for (Field f : clazz.getFields()) {
            System.out.println(clazz.getName() + "属性：" + f.getName());
        }
        System.out.println("========================");
        //可获取私有属性，不能获取父类属性
        //Field[] fields = clazz.getDeclaredFields();
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(clazz.getName() + "属性：" + f.getModifiers() + "|" + f.getName());
        }


        IPersion gril = new Student() {
            @Override
            public void learn() {
                System.out.println("no learn, but play boy");
            }
        };

        try {
            //第一个参数是方法名称，第二个参数是以声明顺序标识方法的形式参数类型的类对象的数组
            Method method = clazz.getDeclaredMethod("play2gril", IPersion.class);
            method.setAccessible(true);
            System.out.println(method.getName());
            //调用无参构造方法构造对象
            //Object o = clazz.newInstance();
            //调用有参构造方法构造对象
            Constructor constructor = clazz.getConstructor(String.class, String.class, int.class, Hanmeimei.class);
            Object o = constructor.newInstance("lilee", "male", 24, hanmeimei);
            //invoke第一个参数表示执行哪个对象的方法，剩下的参数是执行方法时需要传入的参数
            method.invoke(o, gril);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}