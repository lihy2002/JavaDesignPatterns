package priv.lhy.decorator;

/**
 * author : lihy
 * date : 2018/5/21 16:14
 *
 * Decorator装饰角色
 * 一般是一个抽象类(非必需)，实现接口或者抽象方法，它里面可不一定有抽象的方法呀，
 * 在它的属性里必然有一个private变量指向Component抽象构件。
 */
public abstract class DressDecorator implements IDressComponent {

    private IDressComponent man;

    public DressDecorator(IDressComponent man) {
        this.man = man;
    }

    @Override
    public void dress() {
        man.dress();
    }
}
