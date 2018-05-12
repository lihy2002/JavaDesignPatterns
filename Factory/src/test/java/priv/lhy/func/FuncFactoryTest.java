package priv.lhy.func;

import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/3/19 14:13
 */
public class FuncFactoryTest extends TestCase {

     public void testFunc(){
         IFactory factory = new AmMeterFactory();
         System.out.println(factory.getMeter().getName());
         assertEquals(factory.getMeter().getName(),"电表");
     }
}
