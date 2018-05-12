package priv.lhy.lazy;

/**
 * 懒汉式
 * 不在初始化后实例，需等到线程使用时在实例，节省内存资源，但存在线程不安全的问题
 * author : lihy
 * date : 2018/3/20 9:34
 */
public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazyOne = null;

    //线程不安全
    public static LazyOne getInstance(){
        if(null == lazyOne){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

}
