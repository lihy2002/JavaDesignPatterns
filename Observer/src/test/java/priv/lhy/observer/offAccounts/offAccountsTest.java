package priv.lhy.observer.offAccounts;

import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/5/23 16:05
 */
public class offAccountsTest extends TestCase{

    public void testOffAccounts(){
        ObUser user_we = new ObUser("王二");
        ObUser user_zs = new ObUser("张三");
        ObUser user_ls = new ObUser("李四");

        OffServer offServer = new OffServer();
        offServer.addOb(user_ls);
        offServer.addOb(user_we);
        offServer.addOb(user_zs);

        offServer.publish("各位监听者好!");

        System.out.println("===================");

        offServer.removeOb(user_we);
        offServer.publish("好好学习,天天向上!");
    }
}
