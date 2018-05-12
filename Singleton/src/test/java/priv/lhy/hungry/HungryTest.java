package priv.lhy.hungry;


import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/3/20 9:28
 */
public class HungryTest extends TestCase{

    public void testHungry(){
        Hungry h1 = Hungry.getInstance();
        Hungry h2 = Hungry.getInstance();
        assertEquals(h1, h2);
    }
}