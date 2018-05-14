package priv.lhy.payment;

import priv.lhy.activity.ActivityType;
import priv.lhy.entity.PayState;

/**
 * author : lihy
 * date : 2018/5/14 15:49
 */
public class Payment {

    private String uid;
    private double amount;

    public Payment(String uid, double amount) {
        this.uid = uid;
        this.amount = amount;
    }

    public PayState pay(ActivityType activityType){
        return activityType.get().pay(amount);
    }
}
