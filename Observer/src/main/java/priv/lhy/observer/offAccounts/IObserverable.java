package priv.lhy.observer.offAccounts;

/**
 * author : lihy
 * date : 2018/5/23 15:51
 *
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
public interface IObserverable {

    void addOb(IObserver observer);

    void removeOb(IObserver observer);

    void notifyObs(String msg);
}
