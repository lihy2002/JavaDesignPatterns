package priv.lhy.simple;

import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/3/19 14:47
 */
public class SimpleFactoryTest extends TestCase {

    public void testSimpleFactory(){
        System.out.println(new SimpleFactory().getMeter("gasmeter").getName());
        assertEquals(new SimpleFactory().getMeter("gasmeter").getName(), "气表");
    }

    public void  testSimpleFactory2(){
        //System.out.println(new SimpleFactory2().getMeter().getName());
        assertEquals(new SimpleFactory2().getMeter().getName(),"电表");
    }
}
