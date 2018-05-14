package priv.lhy.activity;

import priv.lhy.entity.PayState;

/**
 * author : lihy
 * date : 2018/5/14 15:13
 * 打折
 */
public class DiscountActivity implements IActivity {

    private static double discount = 0.8;

    @Override
    public PayState pay(double amount) {
        PayState ps = new PayState();
        ps.setAmount(amount * discount);
        ps.setMsg("打8折");
        ps.setState(200);
        return ps;
    }
}
