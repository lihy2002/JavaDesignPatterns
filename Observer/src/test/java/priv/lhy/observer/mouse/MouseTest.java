package priv.lhy.observer.mouse;

import junit.framework.TestCase;
import priv.lhy.observer.core.Event;
import priv.lhy.observer.proxy.IMouse;
import priv.lhy.observer.proxy.MouseProxy;
import priv.lhy.observer.proxy.MouseTwo;

import java.lang.reflect.Method;
import java.util.Date;


/**
 * author : lihy
 * date : 2018/5/23 11:15
 */
public class MouseTest extends TestCase {

    public void testMouse() {
        MouseEvenCallback callback = new MouseEvenCallback();
        Method callbackMethod;
        try {
            callbackMethod = MouseEvenCallback.class.getMethod("onClick", Event.class);

            Mouse mouse = new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK, callback, callbackMethod);
            mouse.onClick();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public void testProxyMouse(){
        IMouse mouse = new MouseTwo();
        IMouse mouseProxy = (IMouse) new MouseProxy(mouse).newInstance();
        mouseProxy.onClick();
        System.out.println("===============");
        mouseProxy.onDoubleClick();
        System.out.println("===============");
        mouseProxy.onDown();
        System.out.println("===============");
        mouseProxy.onUp();
        System.out.println("===============");
        mouseProxy.onMove();
    }
}