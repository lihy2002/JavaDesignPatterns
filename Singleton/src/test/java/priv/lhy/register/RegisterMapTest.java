package priv.lhy.register;

import junit.framework.TestCase;

import java.util.concurrent.CountDownLatch;


/**
 * author : lihy
 * date : 2018/3/21 15:05
 */
public class RegisterMapTest extends TestCase{

    public void testRegisterMap(){
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

                        Object obj = RegisterMap.getInstance("map");
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

    public void testBeanFactory() throws InterruptedException {
        //线程数
        int threadCount = 500;
        //主线程等待所有其他子线程完成后再往下执行
        CountDownLatch latch = new CountDownLatch(threadCount);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threadCount; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        //线程休眠等待
                        latch.await();

                        Object obj = BeanFactory.getBean("priv.lhy.register.Pojo");
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            //每创建一个线程，总线程数减一
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("总耗时：" + (end - start));
    }
}