package priv.lhy.lazy;

/**
 * 实例方法增加同步锁，线程安全，但效率降低
 * author : lihy
 * date : 2018/3/20 10:08
 */
public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazyTwo = null;

    public synchronized static LazyTwo getInstance(){
        if(null == lazyTwo){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
