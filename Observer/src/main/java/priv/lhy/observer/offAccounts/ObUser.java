package priv.lhy.observer.offAccounts;


/**
 * author : lihy
 * date : 2018/5/23 16:01
 *
 * 观察者
 * 实现了modify方法
 */
public class ObUser implements IObserver {

    private String userName;

    public ObUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void modify(String msg) {
        System.out.println("用户 " + userName + " 收到信息: " + msg);
    }
}
