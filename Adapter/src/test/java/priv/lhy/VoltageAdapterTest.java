package priv.lhy;

import junit.framework.TestCase;
import priv.lhy.classAdapter.Mobile;
import priv.lhy.classAdapter.ClassVoltageAdapter;
import priv.lhy.classAdapter.Voltage220;
import priv.lhy.objectAdapter.ObjectVoltageAdapter;


/**
 * author : lihy
 * date : 2018/5/16 10:53
 */
public class VoltageAdapterTest extends TestCase {

    public void testClassAdapter(){
        Mobile mobile = new Mobile();
        mobile.charging(new ClassVoltageAdapter());
    }

    public void testObjectAdapter(){
        Mobile mobile = new Mobile();
        mobile.charging(new ObjectVoltageAdapter(new Voltage220()));
    }

    public void testInterfaceAdapter(){

    }

}