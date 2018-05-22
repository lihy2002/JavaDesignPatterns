package priv.lhy.decorator;

import junit.framework.TestCase;


/**
 * author : lihy
 * date : 2018/5/21 16:18
 */
public class DecoratorTest extends TestCase{

    public void testDress(){
        IDressComponent dc = new DressConcreteComponent();
        dc = new HatConcreteDecorator(dc);
        dc = new PantsConcreteDecorator(dc);
        dc.dress();
    }
}