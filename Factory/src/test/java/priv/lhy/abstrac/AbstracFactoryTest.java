package priv.lhy.abstrac;

import junit.framework.TestCase;
import priv.lhy.sbstr.AbstracFactory;
import priv.lhy.sbstr.MeterFactory;

/**
 * author : lihy
 * date : 2018/3/19 14:32
 */
public class AbstracFactoryTest extends TestCase {

    public void testAbstracFactory(){
        AbstracFactory factory = new MeterFactory();
        System.out.println(factory.getAmMeter().getName());
        assertEquals("电表", factory.getAmMeter().getName());
    }
}
