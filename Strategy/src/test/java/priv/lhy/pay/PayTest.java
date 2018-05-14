package priv.lhy.pay;

import junit.framework.TestCase;
import priv.lhy.activity.ActivityType;
import priv.lhy.payment.Payment;

/**
 * author : lihy
 * date : 2018/5/14 15:34
 */
public class PayTest extends TestCase {

    public void testPay() {
        System.out.println(new Payment("tom", 1000).pay(ActivityType.FULLLESS));
    }

}
