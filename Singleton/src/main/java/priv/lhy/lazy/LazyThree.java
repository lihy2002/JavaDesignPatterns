package priv.lhy.lazy;

/**
 * 使用静态内部类实现
 * 由于内部类不会在类的外部被使用，所以只有在调用getInstance()方法时才会被加载。
 * 同时依赖JVM的ClassLoader类加载机制保证了不会出现同步问题。
 * author : lihy
 * date : 2018/3/20 14:39
 */
public class LazyThree {

    //是否实例标志
    private static boolean initFlag = false;

    private LazyThree() {
        //类加同步锁，若使用反射通过构造方法实例化则抛出异常
        synchronized (LazyThree.this){
            if(!initFlag){
                initFlag = !initFlag;
            }else{
                throw new  RuntimeException("对象已实例化");
            }
        }
    }

    public static LazyThree getInstance() {
        return HoldLazyThree.lazyThree;
    }

    private static class HoldLazyThree {
        private static LazyThree lazyThree = new LazyThree();
    }
}
