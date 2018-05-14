package priv.lhy.activity;

import priv.lhy.entity.PayState;

/**
 * author : lihy
 * date : 2018/5/14 15:32
 * 正常付款
 */
public class NormalActivity implements IActivity {

    @Override
    public PayState pay(double amount) {
        PayState ps = new PayState();
        ps.setAmount(amount);
        ps.setMsg("正常付款");
        ps.setState(200);
        return ps;
    }
}
