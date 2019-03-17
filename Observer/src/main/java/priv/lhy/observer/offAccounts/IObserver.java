package priv.lhy.observer.offAccounts;

/**
 * author : lihy
 * date : 2018/5/23 15:53
 *
 * 抽象观察者
 * 定义了一个modify()方法，当被观察者调用notifyObs()方法时，观察者的modify()方法会被回调。
 */
public interface IObserver {

    void modify(String msg);
}
