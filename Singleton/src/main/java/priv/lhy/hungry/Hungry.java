package priv.lhy.hungry;

/**
 * 饿汉式
 * 初始化后就已实例，线程安全，但浪费内存资源
 * author : lihy
 * date : 2018/3/20 9:20
 */
public class Hungry {

    private Hungry(){}

    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }


}
