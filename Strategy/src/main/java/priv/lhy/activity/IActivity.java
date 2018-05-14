package priv.lhy.activity;

import priv.lhy.entity.PayState;

/**
 * author : lihy
 * date : 2018/5/14 15:02
 */
public interface IActivity {

    PayState pay(double amount);
}
