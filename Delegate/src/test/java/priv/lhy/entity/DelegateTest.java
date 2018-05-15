package priv.lhy.entity;

import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/5/15 16:46
 */
public class DelegateTest extends TestCase {

    public void testDelegate(){
        new Leader().doSometing("a");
        System.out.println("================================");
        new Leader().doSometing("b");
    }
}
