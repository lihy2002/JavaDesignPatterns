package priv.lhy.observer.offAccounts;

import java.util.ArrayList;
import java.util.List;

/**
 * author : lihy
 * date : 2018/5/23 15:55
 *
 * 被观察者，也就是公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 */
public class OffServer implements IObserverable {

    //观察者队列
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addOb(IObserver observer) {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void removeOb(IObserver observer) {
        if(observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObs(String msg) {
        for (IObserver observer : observers){
            observer.modify(msg);
        }
    }

    public void publish(String msg){
        System.out.println("公众号发布新消息: " + msg);
        //消息更新，通知所有观察者
        notifyObs(msg);
    }
}
