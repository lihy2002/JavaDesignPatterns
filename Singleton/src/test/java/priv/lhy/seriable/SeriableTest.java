package priv.lhy.seriable;

import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * author : lihy
 * date : 2018/3/21 16:13
 */
public class SeriableTest extends TestCase {

    public void testSeriable() {
        Seriable s1 = Seriable.getInstance();
        Seriable s2;

        FileOutputStream fos;
        try {
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (Seriable) ois.readObject();
            ois.close();

            System.out.println("s1:" + s1 + "||s2:" + s2);
            assertEquals(s1, s2);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}