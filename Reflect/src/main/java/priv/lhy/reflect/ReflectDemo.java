package priv.lhy.reflect;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
@Data
public class ReflectDemo {

    private Class clazz;

    public ReflectDemo(Class clazz){
        this.clazz = clazz;
    }

    public ReflectDemo(Object o){
        this.clazz = o.getClass();
    }

    public ReflectDemo(String className){
        try {
            this.clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

   public Class getParentClass(){
        return clazz.getSuperclass();
   }

   public Method[] getPublicMethods(){
       return clazz.getMethods();
   }

   public Method[] getPrivateMethods(){
       return clazz.getDeclaredMethods();
   }



}
