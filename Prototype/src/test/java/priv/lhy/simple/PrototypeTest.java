package priv.lhy.simple;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * author : lihy
 * date : 2018/3/29 15:06
 */
public class PrototypeTest extends TestCase {

    public void testSimple() {
        Prototype simple1 = new Prototype();
        simple1.setName("tt");
        simple1.setType(1);
        simple1.setList(Arrays.asList("a", "b", "c"));

        try {
            Prototype simple2 = (Prototype) simple1.clone();

            System.out.println("simple1.getList:"+simple1.getList());
            System.out.println("simple2.getList:"+simple2.getList());
            assertEquals(simple1.getList(), simple2.getList());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}