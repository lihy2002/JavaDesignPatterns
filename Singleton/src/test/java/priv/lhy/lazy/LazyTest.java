package priv.lhy.lazy;

import junit.framework.TestCase;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;


/**
 * author : lihy
 * date : 2018/3/20 9:40
 */
public class LazyTest extends TestCase {

    //懒加载线程不安全
    public void testLazySafe() {
        //线程数
        int threadCount = 500;
        //主线程等待所有其他子线程完成后再往下执行
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        //线程休眠等待
                        latch.await();

                        Object obj = LazyOne.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            //每创建一个线程，总线程数减一
            latch.countDown();
        }
    }

    //增加同步锁在高并发下有明显的效率降低
    public void testLazyTwoSpeed() {
        //无同步锁
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Object one = LazyOne.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //有同步锁
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Object two = LazyTwo.getInstance();
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        //内部类
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Object three = LazyThree.getInstance();
        }
        long end3 = System.currentTimeMillis();
        System.out.println(end3 - start3);
    }

    public void testLazyThree() {
        try {
            //获取对象
            Class<?> clazz = LazyThree.class;
            //获取构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //反射对象应该在使用时抑制Java语言访问检查
            //（不是标识方法能不能访问，public方法的accessible也是false，禁止检测可提高性能）
            c.setAccessible(true);

            Object obj1 = c.newInstance();
            Object obj2 = c.newInstance();

            assertEquals(obj1, obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}