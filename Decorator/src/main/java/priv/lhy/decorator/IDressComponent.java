package priv.lhy.decorator;

/**
 * author : lihy
 * date : 2018/5/21 16:09
 *
 * Component抽象构件
 * Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对象
 *
 * 在装饰模式中，必然有一个最基本、最核心、最原始的接口或抽象类充当Component抽象构件
 */
public interface IDressComponent {

    void dress();

}
