package priv.lhy.entity;

/**
 * author : lihy
 * date : 2018/4/9 9:44
 *
 * 抽象类
 * 与接口的区别：
 * 抽象类里面可以定义方法，也可以实现方法，interface只能定义；
 * 抽象类的的方法在子类中可以不实现，也可以重写父类的方法。 而接口中的所有方法一定要实现，不可遗漏
 *
 */
public abstract class Student implements IPersion {

    public String shool;

    @Override
    public void eat() {
        System.out.println("eat something");
    }

    @Override
    public void walk() {
        System.out.println("take a walk");
    }

    //抽象方法，必须在子类中实现
    public abstract void learn();
}
