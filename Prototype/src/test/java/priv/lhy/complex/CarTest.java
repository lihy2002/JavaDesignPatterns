package priv.lhy.complex;

import junit.framework.TestCase;

/**
 * author : lihy
 * date : 2018/3/29 15:22
 */
public class CarTest extends TestCase {

    public void testCar(){
        Car car = new Car();
        car.setLight("lights");
        car.setGlasses("glasses");
        Wheel wheel = new Wheel();
        wheel.setBrand("飞利浦");
        car.setWhlles(wheel);

        Car car2= null;
        try {
            //浅clone
            //car2 = (Car)car.clone();
            //深clone
            car2 = (Car)car.deepClone2Serializable();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(car.getWhlles());
        System.out.println(car2.getWhlles());
        assertEquals(car.getWhlles(), car2.getWhlles());
    }
}
