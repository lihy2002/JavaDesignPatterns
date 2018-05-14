package priv.lhy.activity;

import priv.lhy.entity.FullLessInfo;
import priv.lhy.entity.PayState;

/**
 * author : lihy
 * date : 2018/5/14 15:27
 * 满300减100
 */
public class FullAndLessActivity implements IActivity {

    private static FullLessInfo fl = new FullLessInfo(300, 100);

    @Override
    public PayState pay(double amount) {
        PayState ps = new PayState();
        ps.setState(200);
        ps.setMsg("满300减100");
        ps.setAmount(amount - 100);

        return ps;
    }
}
